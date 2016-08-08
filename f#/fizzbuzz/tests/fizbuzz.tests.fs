module fizzbuzz.tests

open NUnit.Framework
open fizzbuzz_module


[<TestCase(1,"1")>]
[<TestCase(2,"2")>]
[<TestCase(4,"4")>]
let fizzbuzz_of_number_is_number number result = 
    Assert.That(fizzbuzz number, Is.EqualTo result)

[<TestCase(3)>]
[<TestCase(6)>]
[<TestCase(9)>]
let multiple_of_3_is_fizz number =
    Assert.That(fizzbuzz number, Is.EqualTo "fizz")

[<TestCase(5)>]
[<TestCase(10)>]
let multiple_of_5_is_buzz number =
    Assert.That(fizzbuzz number, Is.EqualTo "buzz")

[<TestCase(15)>]
[<TestCase(30)>]
let multiple_of_15_is_fizzbuzz number =
    Assert.That(fizzbuzz number, Is.EqualTo "fizzbuzz")

[<TestCase(1, [|"1"|])>]
[<TestCase(2, [|"1"; "2"|])>]
[<TestCase(10, [|"1"; "2"; "fizz"; "4"; "buzz"; "fizz"; "7"; "8"; "fizz"; "buzz" |])>]
let fizzbuzzes_from_1_to_n n result=
    Assert.That(fizzzbuzz_till n, Is.EqualTo result)
