package p4
import scala.io.StdIn.readInt

object q1 extends App{
  def interest(price: Double): Double = {
    price match{
      case price if price <= 20000 => price * 0.02;
      case price if price <= 200000 => price * 0.04;
      case price if price <= 2000000 => price * 0.35;
      case price if price > 2000000 => price * 0.65;
    }
  }

  var value = readInt();
  print(interest(value));
}
