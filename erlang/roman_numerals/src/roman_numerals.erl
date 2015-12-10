-module(roman_numerals).

-compile(export_all).
numbers_to_roman () -> 
  [
    [1000, "M"], 
    [900, "CM"], 
    [500, "D"], 
    [400, "CD"], 
    [100, "C"], 
    [90, "XC"], 
    [50, "L"], 
    [40, "XL"], 
    [10, "X"], 
    [9, "IX"], 
    [5, "V"], 
    [4, "IV"], 
    [1, "I"]].

roman_of(Number, Result, Rest) when Number < 1 ->
  Result;
roman_of(Number, Result, [[Arabic, Roman] | NumbersToRoman]) when Number >= Arabic->
  roman_of(Number-Arabic, Result ++ Roman,  [[Arabic, Roman] | NumbersToRoman]);
roman_of(Number, Result, [[Arabic, Roman] | NumbersToRoman])  ->
  roman_of(Number, Result, NumbersToRoman).
roman_of(Number) ->
  roman_of(Number, "", numbers_to_roman()).
