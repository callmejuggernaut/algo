object p1480 extends App {

  def runningSum(nums: Array[Int]): Array[Int] = {
    var seq: Seq[Int] = Seq()

    nums foreach { num =>
      seq = seq ++ Seq(seq.lastOption.getOrElse(0) + num)
    }

    seq.toArray
  }

  val c = runningSum(Array(1, 1, 1))

  val a = 1

}
