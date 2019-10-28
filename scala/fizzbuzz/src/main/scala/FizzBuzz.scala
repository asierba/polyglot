object FizzBuzz {
  def main(args: Array[String]): Unit = {
    println("Fizz buzz from 1 to 100")
    (1 to 100).foreach(num => println(s"$num. - ${of(num)}"))
  }

  def of(value: Int): String = {
    if (value % 15 == 0)
      "fizzbuzz"
    else if (value % 5 == 0)
      "buzz"
    else if (value % 3 == 0)
      "fizz"
    else
      value.toString
  }
}
