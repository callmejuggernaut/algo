object p977 extends App {
  def sortedSquares(A: Array[Int]): Array[Int] = {
    A.map(_ * -1).sortWith(_ < _).map(g => g * g)
  }
}
