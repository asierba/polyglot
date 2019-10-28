import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {
  it should "be number for ohters" in {
    FizzBuzz.of(1) should be ("1")
    FizzBuzz.of(2) should be ("2")
    FizzBuzz.of(4) should be ("4")
  }
  it should "be fizz for multiple of 3" in {
    FizzBuzz.of(3) should be ("fizz")
    FizzBuzz.of(6) should be ("fizz")
  }
  it should "be buzz for multiple of 5" in {
    FizzBuzz.of(5) should be ("buzz")
    FizzBuzz.of(10) should be ("buzz")
    FizzBuzz.of(20) should be ("buzz")
  }
  it should "be fizzbuzz for multiple of 15" in {
    FizzBuzz.of(15) should be ("fizzbuzz")
    FizzBuzz.of(30) should be ("fizzbuzz")
  }
}
