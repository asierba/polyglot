import unittest
from fizzbuzz import FizzBuzz

class FizzBuzzTestCase(unittest.TestCase):
  def test_fizzbuzz_of(self):
    self.assertEqual(FizzBuzz.of(1), 1)
    self.assertEqual(FizzBuzz.of(2), 2)
    self.assertEqual(FizzBuzz.of(3), "fizz")
    self.assertEqual(FizzBuzz.of(5), "buzz")
    self.assertEqual(FizzBuzz.of(6), "fizz")
    self.assertEqual(FizzBuzz.of(10), "buzz")
    self.assertEqual(FizzBuzz.of(15), "fizzbuzz")
