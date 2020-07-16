object p1431 extends App {

  def kidsWithCandies(candies: Array[Int], extraCandies: Int): Array[Boolean] = {
    val max = candies.max
    var r: Seq[Boolean] = Seq()

    candies foreach { candy =>
      r = r :+ (candy + extraCandies >= max)

    }

    r.toArray
  }

  val a = 1

}
