/**
 * Created by ayou on 2017/7/6.
 */

var bindClick = function (button, func) {
    button.onclick = func
}

var MenuBar = {
    refresh: function () {
        console.log('刷新菜单页面')
    }
}