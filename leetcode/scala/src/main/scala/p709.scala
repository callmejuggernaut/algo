object p709 extends App {
  def toLowerCase(str: String): String = {
    str.map { c =>
      val pos = c.toInt

      if (pos >= 65 && pos <= 90) {
        (pos + 32).toChar
      } else {
        c
      }
    }
  }

  println(toLowerCase("Hello"))
}
