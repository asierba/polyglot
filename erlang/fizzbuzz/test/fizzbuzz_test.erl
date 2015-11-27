-module(fizzbuzz_test).

-compile(export_all).
-import(fizzbuzz, [fizzbuzz_of/1]).

 -include_lib("eunit/include/eunit.hrl").


fizzbuzz_test() ->
    ?assertEqual(1, fizzbuzz_of(1)),
    ?assertEqual(2, fizzbuzz_of(2)),
    ?assertEqual("fizz", fizzbuzz_of(3)),
    ?assertEqual("buzz", fizzbuzz_of(5)),
    ?assertEqual("fizz", fizzbuzz_of(6)),
    ?assertEqual("fizz", fizzbuzz_of(9)),
    ?assertEqual("buzz", fizzbuzz_of(10)),
    ?assertEqual("fizzbuzz", fizzbuzz_of(15)).
