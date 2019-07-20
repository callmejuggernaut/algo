object p657 extends App {
  def judgeCircle(moves: String): Boolean = {
    var x = 0
    var y = 0
    var prev: Char = '?'
    for (c <- moves) {
      c match {
        case 'U' =>
          y = y + 1
        case 'D' =>
          y = y - 1
        case 'L' =>
          x = x - 1
        case 'R' =>
          x = x + 1
      }

      prev = c
    }

    x == 0 && y == 0
  }

  val r = judgeCircle("LDRRLRUULR")
  val a = 0
}
