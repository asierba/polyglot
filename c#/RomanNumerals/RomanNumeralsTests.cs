using Xunit;

namespace RomanNumerals
{
    public class RomanNumeralsTests
    {
        [Theory]
        [InlineData(0)]
        [InlineData(-1)]
        public void numbers_smaller_than_one_have_no_roman(int arabic)
        {
            Assert.Equal(Roman.Of(arabic), "");
        }
        
        [Theory]
        [InlineData(4000)]
        [InlineData(4001)]
        public void numbers_bigger_than_3999_have_no_roman(int arabic)
        {
            Assert.Equal(Roman.Of(arabic), "");
        }
        
        [Theory]
        [InlineData(1, "I")]
        [InlineData(2, "II")]
        [InlineData(3, "III")]
        [InlineData(5, "V")]
        [InlineData(7, "VII")]
        [InlineData(10, "X")]
        [InlineData(16, "XVI")]
        [InlineData(20, "XX")]
        [InlineData(50, "L")]
        [InlineData(4, "IV")]
        [InlineData(9, "IX")]
        [InlineData(1984, "MCMLXXXIV")]
        [InlineData(3999, "MMMCMXCIX")]
        public void arabic_to_roman(int arabic, string roman)
        {
            Assert.Equal(Roman.Of(arabic), roman);
        }
    }
}