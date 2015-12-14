using System;
using System.Linq;
using static System.Console;
using static fizzbuzz.FizzbuzzGenerator;

namespace fizzbuzz
{
    public class Program
    {
        static void Main(string[] args)
        {
            var to = Convert.ToInt32(args[0]);

            Fizzbuzzes(to).ToList().ForEach(x => Write($"{x} "));
        }

    }
}
