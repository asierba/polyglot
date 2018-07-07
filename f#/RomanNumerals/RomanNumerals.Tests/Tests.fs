module Tests

open System
open Xunit

let rec RomanOf arabic =
    match arabic with
    | 1 -> "I"
    | 4 -> "IV"
    | 5 -> "V"
    | 9 -> "IX"
    | 10 -> "X"
    | 40 -> "XL"
    | 50 -> "L"
    | 90 -> "XC"
    | 100 -> "C"
    | n when n > 100 -> RomanOf 100 + RomanOf (n-100)
    | n when n > 90 -> RomanOf 90 + RomanOf (n-90)
    | n when n > 50 -> RomanOf 50 + RomanOf (n-50)
    | n when n > 40 -> RomanOf 40 + RomanOf (n-40)
    | n when n > 10 -> RomanOf 10 + RomanOf (n-10)
    | n when n > 9 -> RomanOf 9 + RomanOf (n-9)
    | n when n > 5 -> RomanOf 5 + RomanOf (n-5)
    | n when n > 4 -> RomanOf 4 + RomanOf (n-4)
    | n when n > 1 -> RomanOf 1 + RomanOf (n-1)
    | _ -> ""

    
let assertEqual actual expect =
    Assert.Equal(actual, expect)

[<Theory>]
[<InlineData(0, "")>]
[<InlineData(1, "I")>]
[<InlineData(2, "II")>]
[<InlineData(3, "III")>]
[<InlineData(5, "V")>]
[<InlineData(6, "VI")>]
[<InlineData(7, "VII")>]
[<InlineData(8, "VIII")>]
[<InlineData(4, "IV")>]
[<InlineData(9, "IX")>]
[<InlineData(10, "X")>]
[<InlineData(13, "XIII")>]
[<InlineData(14, "XIV")>]
[<InlineData(20, "XX")>]
[<InlineData(30, "XXX")>]
[<InlineData(40, "XL")>]
[<InlineData(49, "XLIX")>]
[<InlineData(50, "L")>]
[<InlineData(87, "LXXXVII")>]
[<InlineData(100, "C")>]
[<InlineData(99, "XCIX")>]
[<InlineData(123, "CXXIII")>]
let ``Roman of`` (arabic, roman) =
    RomanOf arabic |> assertEqual roman
