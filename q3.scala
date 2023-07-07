package p4

object q3 extends App{
  def toUpper(str: String): String = str.toUpperCase
  def toLower(str: String): String = str.toLowerCase
  def formatNames(name: String)= {
    println(toUpper(name))
    println(toLower(name))
  }

  formatNames("Dasun");
}
