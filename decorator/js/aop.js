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

Function.prototype.before = function (afterfn) {
  var _self = this;
  return function () {
    var ret = _self.apply(this, arguments)
    afterfn.apply(this, arguments)
    return ret
  }
}

global.name = 'b'

var obj = {
  name: 'a',
  say: function () {
    console.log(this.name)
  }
}

obj.say2 = obj.say.before(function () {
  console.log(this.name)
}).bind(obj)

obj.say2()