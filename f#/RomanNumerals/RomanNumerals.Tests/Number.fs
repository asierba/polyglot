module Number

let lastItem map =
    map |> Map.toList |> List.last 
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
