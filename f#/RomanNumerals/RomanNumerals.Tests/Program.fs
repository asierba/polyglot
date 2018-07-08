open Number

module Program = 
    let [<EntryPoint>] main _ =
        let number = System.Console.ReadLine() |> System.Int32.Parse
        printfn "Roman of %d: %s" number (RomanOf number)
        0
