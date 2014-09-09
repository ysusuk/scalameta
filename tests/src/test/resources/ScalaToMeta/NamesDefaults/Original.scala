object NamesDefaultsMethods {
  def one(x: Int = 2, y: Int = -40): Unit = ???
  one(2, -40)
  one(y = -40, x = 2)
  one(x = 2, y = -40)
  one(x = 100)
  one(y = 100)
  one(100)
  one()
  var qualone = this
  qualone.one(2, -40)
  qualone.one(y = -40, x = 2)
  qualone.one(x = 2, y = -40)
  qualone.one(x = 100)
  qualone.one(y = 100)
  qualone.one(100)
  qualone.one()
  def onezero(x: Int = 2, y: Int = -40)(z: Int, w: Int): Unit = ???
  onezero(2, -40)(1, 2)
  onezero(y = -40, x = 2)(3, 4)
  onezero(x = 2, y = -40)(5, 6)
  onezero(x = 100)(7, 8)
  onezero(y = 100)(9, 10)
  onezero(100)(11, 12)
  onezero()(13, 14)
  var qualonezero = this
  qualonezero.onezero(2, -40)(15, 16)
  qualonezero.onezero(y = -40, x = 2)(17, 18)
  qualonezero.onezero(x = 2, y = -40)(19, 20)
  qualonezero.onezero(x = 100)(21, 22)
  qualonezero.onezero(y = 100)(23, 24)
  qualonezero.onezero(100)(25, 26)
  qualonezero.onezero()(27, 28)
  def zeroone(x: Int, y: Int)(z: Int = 2, w: Int = -40): Unit = ???
  zeroone(1, 2)(2, -40)
  zeroone(3, 4)(w = -40, z = 2)
  zeroone(5, 6)(z = 2, w = -40)
  zeroone(7, 8)(z = 100)
  zeroone(9, 10)(w = 100)
  zeroone(11, 12)(100)
  zeroone(13, 14)()
  var qualzeroone = this
  qualzeroone.zeroone(15, 16)(2, -40)
  qualzeroone.zeroone(17, 18)(w = -40, z = 2)
  qualzeroone.zeroone(19, 20)(z = 2, w = -40)
  qualzeroone.zeroone(21, 22)(z = 100)
  qualzeroone.zeroone(23, 24)(w = 100)
  qualzeroone.zeroone(25, 26)(100)
  qualzeroone.zeroone(27, 28)()
  def oneone(x: Int = 2, y: Int = -40)(z: Int = 2, w: Int = -40): Unit = ???
  oneone(2, -40)(2, -40)
  oneone(y = -40, x = 2)(w = -40, z = 2)
  oneone(x = 2, y = -40)(z = 2, w = -40)
  oneone(x = 100)(z = 100)
  oneone(y = 100)(w = 100)
  oneone(100)(100)
  oneone()()
  var qualoneone = this
  qualoneone.oneone(2, -40)(2, -40)
  qualoneone.oneone(y = -40, x = 2)(w = -40, z = 2)
  qualoneone.oneone(x = 2, y = -40)(z = 2, w = -40)
  qualoneone.oneone(x = 100)(z = 100)
  qualoneone.oneone(y = 100)(w = 100)
  qualoneone.oneone(100)(100)
  qualoneone.oneone()()
}
object NamesDefaultsPrimary {
  class One(x: Int = 2, y: Int = -40)
  new One(2, -40)
  new One(y = -40, x = 2)
  new One(x = 2, y = -40)
  new One(x = 100)
  new One(y = 100)
  new One(100)
  new One()
  class Onezero(x: Int = 2, y: Int = -40)(z: Int, w: Int)
  new Onezero(2, -40)(1, 2)
  new Onezero(y = -40, x = 2)(3, 4)
  new Onezero(x = 2, y = -40)(5, 6)
  new Onezero(x = 100)(7, 8)
  new Onezero(y = 100)(9, 10)
  new Onezero(100)(11, 12)
  new Onezero()(13, 14)
  class Zeroone(x: Int, y: Int)(z: Int = 2, w: Int = -40)
  new Zeroone(1, 2)(2, -40)
  new Zeroone(3, 4)(w = -40, z = 2)
  new Zeroone(5, 6)(z = 2, w = -40)
  new Zeroone(7, 8)(z = 100)
  new Zeroone(9, 10)(w = 100)
  new Zeroone(11, 12)(100)
  new Zeroone(13, 14)()
  class Oneone(x: Int = 2, y: Int = -40)(z: Int = 2, w: Int = -40)
  new Oneone(2, -40)(2, -40)
  new Oneone(y = -40, x = 2)(w = -40, z = 2)
  new Oneone(x = 2, y = -40)(z = 2, w = -40)
  new Oneone(x = 100)(z = 100)
  new Oneone(y = 100)(w = 100)
  new Oneone(100)(100)
  new Oneone()()
}
object NamesDefaultsSuper {
  class One(x: Int = 2, y: Int = -40)
  class One1 extends One(2, -40)
  class One2 extends One(y = -40, x = 2)
  class One3 extends One(x = 2, y = -40)
  class One4 extends One(x = 100)
  class One5 extends One(y = 100)
  class One6 extends One(100)
  class One7 extends One()
  class Onezero(x: Int = 2, y: Int = -40)(z: Int, w: Int)
  class Onezero1 extends Onezero(2, -40)(1, 2)
  class Onezero2 extends Onezero(y = -40, x = 2)(3, 4)
  class Onezero3 extends Onezero(x = 2, y = -40)(5, 6)
  class Onezero4 extends Onezero(x = 100)(7, 8)
  class Onezero5 extends Onezero(y = 100)(9, 10)
  class Onezero6 extends Onezero(100)(11, 12)
  class Onezero7 extends Onezero()(13, 14)
  class Zeroone(x: Int, y: Int)(z: Int = 2, w: Int = -40)
  class Zeroone1 extends Zeroone(1, 2)(2, -40)
  class Zeroone2 extends Zeroone(3, 4)(w = -40, z = 2)
  class Zeroone3 extends Zeroone(5, 6)(z = 2, w = -40)
  class Zeroone4 extends Zeroone(7, 8)(z = 100)
  class Zeroone5 extends Zeroone(9, 10)(w = 100)
  class Zeroone6 extends Zeroone(11, 12)(100)
  class Zeroone7 extends Zeroone(13, 14)()
  class Oneone(x: Int = 2, y: Int = -40)(z: Int = 2, w: Int = -40)
  class Oneone1 extends Oneone(2, -40)(2, -40)
  class Oneone2 extends Oneone(y = -40, x = 2)(w = -40, z = 2)
  class Oneone3 extends Oneone(x = 2, y = -40)(z = 2, w = -40)
  class Oneone4 extends Oneone(x = 100)(z = 100)
  class Oneone5 extends Oneone(y = 100)(w = 100)
  class Oneone6 extends Oneone(100)(100)
  class Oneone7 extends Oneone()()
}