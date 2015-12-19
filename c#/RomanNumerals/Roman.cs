using System.Collections.Generic;

namespace RomanNumerals
{
    public class Roman
    {
        static Dictionary<string,int> romanToArabics = new Dictionary<string,int> {
            {"M", 1000},
            {"CM", 900},
            {"D", 500},
            {"CD", 400},
            {"C", 100},
            {"XC", 90},
            {"L", 50},
            {"XL", 40},
            {"X", 10},
            {"IX", 9},
            {"V", 5},
            {"IV", 4},
            {"I", 1}
        };
        
        const int biggestRoman = 3999;
            
        public static string Of(int arabic)
        {   
            if (arabic > biggestRoman || arabic <= 0)
            {
                return "";
            }
            
            var result = "";
            
            foreach (var romanToArabic in romanToArabics)
            {
                while (arabic >= romanToArabic.Value)
                {
                    result += romanToArabic.Key;
                    arabic -= romanToArabic.Value;
                }    
            }
           
            return result;
        }
    }
}