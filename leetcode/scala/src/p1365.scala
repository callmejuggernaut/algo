object p1365 extends App {

  def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
    val sorted = nums.sortWith((a: Int, b: Int) =>  a < b)
    var r: Seq[Int] = Seq()

    nums foreach { num =>
      val f: Int = sorted.indexOf(num)
      r = r ++ Seq(f)
    }

    r.toArray
  }

  val c = smallerNumbersThanCurrent(Array(8,1,2,2,3))

  val a = 1

}
