/**
 * Created by ayou on 2017/7/7.
 */

Function.prototype.before = function (beforefn) {
  var _self = this;
  return function () {
    beforefn.apply(this, arguments)
    return _self.apply(this, arguments)
  }
}

var func = function (param) {
  console.log(param)
}

func = func.before(function (param) {
  console.log(param === arguments[0])
  param.b = 'b'
})

func({a: 'a'})

///////////////////////////////////////////////

var ajax = function (type, url, param) {
  console.dir(param)
}

ajax = ajax.before(function (type, url, param) {
  param.TOKEN = ''
})

ajax('get', 'http://test', {name: 'ayou'})