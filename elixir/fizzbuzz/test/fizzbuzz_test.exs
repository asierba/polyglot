defmodule FizzbuzzTest do
  use ExUnit.Case
  doctest Fizzbuzz

  test "convert number to fizzbuzz" do
    assert 1 == Fizzbuzz.convert(1)
    assert 2 == Fizzbuzz.convert(2)
    assert :fizz == Fizzbuzz.convert(3)
    assert :buzz == Fizzbuzz.convert(5)
    assert :fizz == Fizzbuzz.convert(6)
    assert :fizz == Fizzbuzz.convert(9)
    assert :buzz == Fizzbuzz.convert(10)
    assert :fizzbuzz == Fizzbuzz.convert(15)
  end
  
  test "convert first numbers to fizzbuzz" do
    assert Fizzbuzz.till(1) == [1] 
    assert Fizzbuzz.till(2) == [1, 2]
    assert Fizzbuzz.till(3) == [1, 2, :fizz]
    assert Fizzbuzz.till(20) == [1, 2, :fizz, 4, :buzz, :fizz, 7, 8, :fizz, :buzz, 
      11, :fizz, 13, 14, :fizzbuzz, 16, 17, :fizz, 19, :buzz]
  end
end
