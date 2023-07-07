package p4
import scala.io.StdIn.readInt

object q2 extends App{
  def PatternMatching(x: Int): String = x match{
    case x if x < 0 => "Negative";
    case x if x == 0 => "Zero";
    case x if x % 2 == 0 => "Even";
    case _ => "Odd";
  }

  print(PatternMatching(readInt()))
}
