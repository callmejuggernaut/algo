object p804 extends App {
  def uniqueMorseRepresentations(words: Array[String]): Int = {
    var r: scala.collection.mutable.Set[String] = scala.collection.mutable.Set.empty[String]

    words.foreach { word =>
      r.add(toMorze(word))
    }

    r.size
  }

  def toMorze(word: String): String = {
    val MORSE: Seq[String] = List(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
    word.map { letter =>
      val pos = letter.toInt - 97
      MORSE(pos)
    }.mkString("")
  }

  println(uniqueMorseRepresentations(Array("gin", "zen", "gig", "msg")))
}
