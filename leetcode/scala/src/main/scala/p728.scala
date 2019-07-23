object p728 extends App {
  def selfDividingNumbers(left: Int, right: Int): List[Int] = {
    var result: scala.collection.mutable.ArrayBuffer[Int] = scala.collection.mutable.ArrayBuffer.empty
    for (i <- left to right) {
      val digits: Seq[Int] = i.toString.toSeq.map(_.toString.toInt)

      if (!digits.contains(0)) {
        var r = true
        for (j <- digits) {
          if (i % j != 0) {
            r = false
          }
        }

        if (r) {
          result += i
        }
      }
    }

    result.toList
  }

  val r = selfDividingNumbers(1, 22)
  println(r)
  val a = 1
}
