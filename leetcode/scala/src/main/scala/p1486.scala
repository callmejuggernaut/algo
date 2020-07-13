object p1486 extends App {

  def xorOperation(n: Int, start: Int): Int = {
    var xored = 0
    var i = 0
    while (i != n) {
      xored = xored ^ (start + i * 2)

      i = i + 1
    }

    xored
  }

  val a = 1

}
