using System.Collections.Generic; 

namespace fizzbuzz
{
    public class FizzbuzzGenerator
    {
        public static IEnumerable<string> Fizzbuzzes(int to)
        {
            for(var i=1; i <= to; i++)
            {
                yield return i.ToFizzbuzz();
            }
        }
    }
}
