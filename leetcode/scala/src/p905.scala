object p905 extends App {
  def sortArrayByParity(A: Array[Int]): Array[Int] = {
    val b = A.filter(_ % 2 == 0)
    val c = A.filter(_ % 2 == 1)

    b ++ c
  }

  val a = sortArrayByParity(Array(0,2,4,6,1))
}
