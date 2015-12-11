defmodule RomanNumeralsTest do
  use ExUnit.Case
  use RomanNumerals
  doctest RomanNumerals

  test "no roman of numbers smaller than 1 or bigger than 3999" do
    assert roman_of(0) == ""
    assert roman_of(-1) == ""
    assert roman_of(4000) == ""
  end

  test "roman of" do
    assert roman_of(1) == "I" 
    assert roman_of(2) == "II" 
    assert roman_of(3) == "III" 
    assert roman_of(5) == "V" 
    assert roman_of(8) == "VIII" 
    assert roman_of(10) == "X" 
    assert roman_of(30) == "XXX" 
    assert roman_of(4) == "IV" 
    assert roman_of(9) == "IX" 
    assert roman_of(50) == "L" 
    assert roman_of(40) == "XL" 

    assert roman_of(1984) == "MCMLXXXIV" 
    assert roman_of(3999) == "MMMCMXCIX" 
  end
end
