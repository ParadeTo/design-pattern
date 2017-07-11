/**
 * Created by ayou on 2017/7/11.
 */

var Light = function () {
  // 各种状态的实例
  this.offLightState = new OffLightState(this)
  this.weakLightState = new WeakLightState(this)

  this.currState = null
  this.button = null
}

Light.prototype.setState = function (newState) {
  this.currState = newState
}

Light.prototype.init = function () {
  var button = document.createElement('button'),
      self = this

  button.innerHTML = '开关'
  this.button = document.body.appendChild(button)
  this.button.onclick = function () {
    self.currState.buttonWasPressed()
  }
}