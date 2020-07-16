object p961 extends App {
  def repeatedNTimes(A: Array[Int]): Int = {
    val n = A.length / 2
    val c = A.length - (n + 1)
    var map: scala.collection.mutable.Map[Int, Int] = scala.collection.mutable.Map.empty

    var result: Int = A.head
    breakable {
      for (e <- A) {
        val cur: Int = map.getOrElse(e, 0)

        if (cur == c) {
          result = e
          break
        }

        map += (e -> (cur + 1))
      }
    }

    result
  }

  val b = repeatedNTimes(Array(2,1,2,5,3,2))
}
