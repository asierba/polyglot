-module(roman_numerals_test).

-compile(export_all).
-import(roman_numerals, [roman_of/1]).

 -include_lib("eunit/include/eunit.hrl").

there_is_no_roman_for_non_positive_numbers_test() ->
  ?assertEqual("", roman_of(0)),
  ?assertEqual("", roman_of(-1)).

number_to_roman_test() ->
  ?assertEqual("I", roman_of(1)),
  ?assertEqual("II", roman_of(2)),
  ?assertEqual("III", roman_of(3)),
  ?assertEqual("V", roman_of(5)),
  ?assertEqual("VII", roman_of(7)),
  ?assertEqual("X", roman_of(10)),
  ?assertEqual("XVI", roman_of(16)),
  ?assertEqual("XXX", roman_of(30)),
  ?assertEqual("IV", roman_of(4)),
  ?assertEqual("IX", roman_of(9)),
  
  ?assertEqual("MCMLXXXIV", roman_of(1984)),
  ?assertEqual("MMMCMXCIX", roman_of(3999)).

