/**
 * Created by ayou on 2017/7/7.
 */
function Player(name, teamColor) {
  this.name = name
  this.teamColor = teamColor
  this.state = 'alive'
}

Player.prototype.win = function () {
  console.log(this.name + ' win')
}

Player.prototype.lose = function () {
  console.log(this.name + ' lose')
}

Player.prototype.die = function () {
  this.state = 'dead'
  // 给中介者发消息，玩家死亡
  playerDirector.receiveMessage('playerDead', this)
}

Player.prototype.remove = function () {
  // 给中介者发消息，移除玩家
  playerDirector.receiveMessage('removePlayer', this)
}

Player.prototype.changeTeam = function (color) {
  // 给中介者发消息，玩家换队
  playerDirector.receiveMessage('changeTeam', this, color)
}

/*************中介者****************/
var playerDirector = (function() {
  var players = {}, // 保存所有玩家
      operations = {} // 中介者可以执行的操作

  operations.addPlayer = function (player) {
    var teamColor = player.teamColor
    players[teamColor] = players[teamColor] || []
    players[teamColor].push(player)
  }

  operations.removePlayer = function (player) {
    var teamColor = player.teamColor,
        teamPlayers = players[teamColor] || []
    for (var i = teamPlayers.length - 1; i >= 0; i--) {
      if (teamPlayers[i] === player) {
        teamPlayers.splice(i, 1)
      }
    }
  }

  operations.changeTeam = function (player, newTeamColor) {
    operations.removePlayer(player)
    player.teamColor = newTeamColor
    operations.addPlayer(player)
  }

  operations.playerDead = function (player) {
    var teamColor = player.teamColor,
        teamPlayers = players[teamColor]

    var all_dead = true

    for (var i = 0, player; player = teamPlayers[i++];) {
      if (player.state !== 'dead') {
        all_dead = false
        break
      }
    }

    if (all_dead === true) {
      // 本队所有玩家lose
      for (var i = 0, player; player = teamPlayers[i++];) {
        player.lose()
      }

      // 其他队玩家win
      for (var color in players) {
        if (color !== teamColor) {
          var teamPlayers = players[color]
          for (var i = 0, player; player = teamPlayers[i++];) {
            player.win()
          }
        }
      }
    }
  }
  
  var receiveMessage = function () {
    // arguments 的第一个参数为消息名称
    var message = Array.prototype.shift.call(arguments);
    operations[message].apply(this, arguments)
  }

  return {
    receiveMessage: receiveMessage
  }
})()

/*******创建玩家的工厂*******/
var playerFactory = function (name, teamColor) {
  var newPlayer = new Player(name, teamColor)
  playerDirector.receiveMessage('addPlayer', newPlayer)
  return newPlayer
}


// 测试
var p1 = playerFactory('小乖', 'blue')
var p2 = playerFactory('黑妞', 'blue')
var p3 = playerFactory('宝宝', 'blue')
var p4 = playerFactory('胖墩', 'blue')

var p5 = playerFactory('小乖2', 'red')
var p6 = playerFactory('黑妞2', 'red')
var p7 = playerFactory('宝宝2', 'red')
var p8 = playerFactory('胖墩2', 'red')

p1.changeTeam('red')
p2.die()
p3.die()
p4.die()
p1.changeTeam('blue')
p1.die()