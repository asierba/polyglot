-module(fizzbuzz).

-compile(export_all).

fizzbuzz_of(N) when (N rem 15 == 0) -> 
  "fizzbuzz";
fizzbuzz_of(N) when (N rem 3 == 0) -> 
  "fizz";
fizzbuzz_of(N) when (N rem 5 == 0) -> 
  "buzz";
fizzbuzz_of(N) -> 
  N.

to(N) -> 
  lists:foreach(fun(M) -> io:format("~p ", [fizzbuzz_of(M)]) end , lists:seq(1,N)).

main(Args) ->
  to(list_to_integer(lists:nth(1, Args))).
