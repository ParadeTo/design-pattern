/**
 * Created by ayou on 2017/7/10.
 */

var Light = function () {
  this.state = 'off'
  this.button = null
}

Light.prototype.buttonWasPressed = function () {
  // 当前状态
  if (this.state === 'off') {
    // 设置下个状态
    console.log('弱光')
    this.state = 'weakLight'
  } else if (this.state === 'weakLight') {
    console.log('强光')
    this.state = 'strongLight'
  } else if (this.state === 'strongLight') {
    console.log('关灯')
    this.state = 'off'
  }
}

Light.prototype.init = function () {
  var button = document.createElement('button'),
      self = this

  button.innerHTML = '开关'
  this.button = document.body.appendChild(button)
  this.button.onclick = function () {
    self.buttonWasPressed()
  }
}