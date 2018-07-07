module Tests

open System
open Xunit

let RomanOf x = ""

[<Fact>]
let ``My test`` () =
    Assert.Equal("", (RomanOf 0 ))
