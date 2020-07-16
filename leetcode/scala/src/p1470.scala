object p1470 extends App {

  def shuffle(nums: Array[Int], n: Int): Array[Int] = {
    var r: Seq[Int] = Seq()
    val half: Int = math.ceil((nums.length - 1) / 2).toInt + 1

    (0 until half) foreach { i =>
      r = r ++ Seq(nums(i), nums(i + half))
    }

    r.toArray
  }

  val c = shuffle(Array(2,5,1,3,4,7), 3)

  val a = 1

}
