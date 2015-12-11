defmodule RomanNumerals do
  defmacro __using__(_opts) do
    quote do
      import RomanNumerals
    end
  end

  defp arabic_to_roman, do: 
   [{1000,"M"},
    {900,"CM"},
    {500,"D"},
    {400,"CD"},
    {100,"C"},
    {90,"XC"},
    {50,"L"},
    {40,"XL"},
    {10,"X"},
    {9,"IX"},
    {5,"V"}, 
    {4,"IV"},
    {1,"I"}]

  defp roman_of(number, _roman_to_numeral) when number < 1 or number > 3999 do
    ""
  end

  defp roman_of(number, [{arabic, roman} | roman_to_numeral]) when number >= arabic do
    roman <> roman_of(number-arabic, [{arabic, roman} | roman_to_numeral])
  end

  defp roman_of(number, [{_arabic, _roman} | roman_to_numeral]) do
    roman_of(number, roman_to_numeral)
  end

  def roman_of(number) do
    roman_of(number, arabic_to_roman)
  end
end
