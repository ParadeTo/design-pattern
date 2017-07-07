/**
 * Created by ayou on 2017/7/7.
 */

var Plane = function () {

}

Plane.prototype.fire = function () {
  console.log('发射普通子弹')
}

var MissileDecorator = function (plane) {
  // 被装饰的对象
  this.plane = plane
}

MissileDecorator.prototype.fire = function () {
  console.log('发射导弹')
  this.plane.fire()
}

var AtomDecorator = function (plane) {
  // 被装饰的对象
  this.plane = plane
}

AtomDecorator.prototype.fire = function () {
  console.log('发射原子弹')
  this.plane.fire()
}

var plane = new Plane()
plane = new MissileDecorator(plane)
plane = new AtomDecorator(plane)
plane.fire()

