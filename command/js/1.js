/**
 * Created by ayou on 2017/7/6.
 */
// Invoker
var bindClick = function (button, func) {
  button.onclick = func
}

// Receiver
var MenuBar = {
  refresh: function () {
    console.log('刷新菜单页面')
  }
}

var SubMenu = {
  add: function () {
    console.log()
  }
}