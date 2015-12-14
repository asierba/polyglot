using System;
using System.Collections.Generic;
using System.Linq;
using Xunit;
using static fizzbuzz.FizzbuzzGenerator;

namespace fizzbuzz
{
    public class FizzbuzzTests
    {
        [Theory]
        [InlineData(1, 1)]
        [InlineData(2, 2)]
        [InlineData(3, "fizz")]
        [InlineData(5, "buzz")]
        [InlineData(6, "fizz")]
        [InlineData(10, "buzz")]
        [InlineData(15, "fizzbuzz")]
        public void NumberToFizzbuz(int number, string fizzbuzz)
        {
            Assert.Equal(fizzbuzz, number.ToFizzbuzz());
        }

        [Fact]
        public void ListOfFizzBuzzes()
        {
            Assert.Equal(new [] {"1"}, Fizzbuzzes(1));
            Assert.Equal(new [] {"1", "2"}, Fizzbuzzes(2));
            Assert.Equal(new [] { "1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz"},
                Fizzbuzzes(20));
        }

    }
}
