/**
 * Created by ayou on 2017/7/6.
 */



// Handler
var order500 = function (orderType, pay, stock) {
  if (orderType === 1 && pay === true) {
    console.log('500元定金预购，得到100优惠券')
  } else {
    return 'nextSuccessor' // 甩锅给下一个节点
  }
}

var order200 = function (orderType, pay, stock) {
  if (orderType === 2 && pay === true) {
    console.log('200元定金预购，得到50优惠券')
  } else {
    return 'nextSuccessor' // 甩锅给下一个节点
  }
}

// 真苦逼，不能再甩锅了
var orderNormal = function (orderType, pay, stock) {
  if (stock > 0) {
    console.log('普通购买，无优惠券')
  } else {
    console.log('手机库存不足')
  }
}

/**
 * 职责链
 * @param fn
 * @constructor
 */
var Chain = function (fn) {
  this.fn = fn;
  this.successor = null
}
Chain.prototype.setSuccessor = function (successor) {
  return this.successor = successor
}
Chain.prototype.handleRequest = function () {
  var ret = this.fn.apply(this, arguments)
  if (ret === 'nextSuccessor') {
    return this.next.apply(this, arguments)
  }
  return ret
}
Chain.prototype.next = function () {
  return this.successor && this.successor.handleRequest.apply(this.successor, arguments)
}

// 包装成职责链的节点
var chainOrder500 = new Chain(order500)
var chainOrder200 = new Chain(order200)
var chainOrderNormal = new Chain(orderNormal)

// 指定节点在职责链中的顺序
chainOrder500.setSuccessor(chainOrder200)
chainOrder200.setSuccessor(chainOrderNormal)

chainOrder500.handleRequest(1, true, 500)
chainOrder500.handleRequest(2, true, 500)

// 增加300元的
var order300 = function (orderType, pay, stock) {
  if (orderType === 3 && pay === true) {
    console.log('300元定金预购，得到80优惠券')
  } else {
    return 'nextSuccessor' // 甩锅给下一个节点
  }
}

var chainOrder300 = new Chain(order300)
chainOrder500.setSuccessor(chainOrder300)
chainOrder300.setSuccessor(chainOrder200)

chainOrder500.handleRequest(3, true, 500)

// 异步
var fn1 = new Chain(function () {
  console.log(1)
  return 'nextSuccessor'
})

var fn2 = new Chain(function () {
  console.log(2)
  var self = this;
  setTimeout(function () {
    self.next()
  }, 1000)
})

var fn3 = new Chain(function () {
  console.log(3)
})

fn1.setSuccessor(fn2).setSuccessor(fn3)
fn1.handleRequest()

// after
Function.prototype.after = function (fn) {
  var self = this;
  return function () {
    var ret = self.apply(this, arguments)
    if (ret === 'nextSuccessor') {
      return fn.apply(this, arguments)
    }
    return ret
  }
}

var order = order500.after(order200).after(orderNormal)

order(1, true, 500)