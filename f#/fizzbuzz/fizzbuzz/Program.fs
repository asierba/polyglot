module fizzbuzz_module

let fizzbuzz x =
     match x % 3, x % 5 with
        | 0, 0 -> "fizzbuzz"
        | _, 0 -> "buzz"
        | 0, _ -> "fizz"
        | _ -> x.ToString()
let fizzzbuzz_till n =
    [1..n] |> Seq.map fizzbuzz

[<EntryPoint>]
let main argv = 
    let number = System.Console.ReadLine() |> System.Int32.Parse
    printfn "Fizzbuzzes from 1 to %d" number
    fizzzbuzz_till number |> Seq.iter (printfn "%s")
    System.Console.ReadKey()
    0

