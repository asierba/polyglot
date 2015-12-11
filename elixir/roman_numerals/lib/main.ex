input = IO.gets("Number: ")
{number, _} = Integer.parse(input)

roman = RomanNumerals.roman_of(number)

IO.puts "Roman:  #{roman}"
