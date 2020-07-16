object p1512 extends App {

  def numIdenticalPairs(nums: Array[Int]): Int = {
    var count = 0

    for ((num, i) <- nums.zipWithIndex) {
      i + 1 until nums.length foreach { j =>
        if (nums(i) == nums(j)) {
          count = count + 1
        }
      }

    }

    count
  }

  val c = numIdenticalPairs(Array(1,2,3,1,1,3))

  val a = 1

}
