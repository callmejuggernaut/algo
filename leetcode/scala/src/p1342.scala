object p1342 extends App {

  def numberOfSteps (num: Int): Int = {
    var current = num
    var stepCount = 0

    while (current != 0) {
      if (current % 2 == 0) {
        current = current / 2
      } else {
        current = current - 1
      }

      stepCount = stepCount + 1
    }

    stepCount
  }

  val a = 1

}
