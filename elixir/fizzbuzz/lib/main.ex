defmodule Main do
  use Application
    
  defp print([head | rest]) do
   IO.write head
   IO.write " "
   print rest
  end
  
  defp print(x) do
    IO.puts x
  end

  def start(_type, _args) do
  	till = 100
    IO.puts "Fizzbuzz from 1 to #{till}"
	  print Fizzbuzz.till(till)
    
    Task.start(fn -> :timer.sleep(1000); end)
  end
end