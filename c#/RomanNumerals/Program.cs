using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace RomanNumerals
{
    public class Program
    {
        public void Main(string[] args)
        {
            Console.Write("Arabic: ");
            int arabic = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine($"Roman: {Roman.Of(arabic)}");
        }
    }
}
