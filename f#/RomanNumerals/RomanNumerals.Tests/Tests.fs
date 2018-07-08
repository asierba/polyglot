module Tests

open System
open Xunit


let lastItem map =
    map |> Map.toList |> List.sortByDescending(fun x -> fst x) |> List.head 
let removeLast map =
    map |> Map.toList |> List.sortByDescending(fun x -> fst x) |> List.tail |> Map.ofList  
    
    

            
let rec RomanOf arabic =
    let decimalToArabic =
        Map.empty.
            Add(1,"I").
            Add(4,"IV").
            Add(5,"V").
            Add(9,"IX").
            Add(10,"X").
            Add(40,"XL").
            Add(50,"L").
            Add(90,"XC").
            Add(100,"C").
            Add(400,"CD").
            Add(500,"D").
            Add(1000,"M")
            
    let rec _RomanOf arabic decimalToArabic =
        let currentArabic = lastItem decimalToArabic |> fst
        let newDecimalToArabic = removeLast decimalToArabic
        match arabic with
        | n when n <= 0 -> ""
        | n when decimalToArabic.ContainsKey(n) -> decimalToArabic.[n]
        | n when n > currentArabic -> 
            decimalToArabic.[currentArabic] + _RomanOf (n-currentArabic) decimalToArabic
        | n ->  _RomanOf n newDecimalToArabic
    
    _RomanOf arabic decimalToArabic

    
    
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
[<InlineData(300, "CCC")>]
[<InlineData(400, "CD")>]
[<InlineData(500, "D")>]
[<InlineData(1000, "M")>]
[<InlineData(3888, "MMMDCCCLXXXVIII")>]
[<InlineData(-1, "")>]
let ``Roman of`` (arabic, roman) =
    RomanOf arabic |> assertEqual roman
