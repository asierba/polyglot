object FizzBuzz {
  def main(args: Array[String]): Unit = {
    println("Fizz buzz from 1 to 100")
    (1 to 100).foreach(num => println(s"$num. - ${of(num)}"))
  }

  def of(value: Int): String =
    (value % 5, value % 3) match {
      case (0, 0) => "fizzbuzz"
      case (_, 0) => "fizz"
      case (0, _) => "buzz"
      case _ => value.toString
    }
}
