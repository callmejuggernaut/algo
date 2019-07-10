object p832 {
  def flipAndInvertImage1(A: Array[Array[Int]]): Array[Array[Int]] = {
    var i = 0
    for (x <- A) {
      val half: Double = Math.ceil(x.length / 2.0) - 1
      var j = 0
      while (j <= half.toInt) {
        val temp = x(j)
        x.update(j, x(x.length - j - 1) ^ 1)
        x.update(x.length - j - 1, temp ^ 1)

        j = j + 1
      }

      i = i + 1
    }

    A
  }

  def flipAndInvertImage(A: Array[Array[Int]]): Array[Array[Int]] = {
    A.map { item =>
      item.map(i => i ^ 1).reverse
    }
  }

  val a = flipAndInvertImage(Array(Array(1, 1, 0, 0), Array(1, 0, 0, 1), Array(0, 1, 1, 1), Array(1, 0, 1, 0)))
  val c = flipAndInvertImage(Array(Array(1, 1, 0), Array(1, 0, 1), Array(0, 0, 0)))
}
