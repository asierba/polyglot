object FizzBuzz {
  def main(args: Array[String]): Unit = {
    val range = 1 to 100
    println(s"Fizz buzz for $range")
    range.foreach(num => println(s"$num. - ${of(num)}"))
  }

  def of(value: Int): String =
    (value % 5, value % 3) match {
      case (0, 0) => "fizzbuzz"
      case (_, 0) => "fizz"
      case (0, _) => "buzz"
      case _ => value.toString
    }
}
