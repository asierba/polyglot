defmodule Fizzbuzz do
  def convert(number) do
    case {rem(number,3), rem(number,5)} do
      {0, 0}  -> 
        :fizzbuzz
      {0, _}  -> 
        :fizz
      {_, 0} ->
        :buzz
      _ ->
        number
    end
  end
  
  def till(0) do
    []
  end
  
  def till(number) do
    till(number-1) ++ [convert(number)]
  end
end
