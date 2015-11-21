import unittest
from decimal import Decimal

class DecimalTestCase(unittest.TestCase):
  def test_to_roman(self):
    self.assertEqual(Decimal(1).to_roman(), "I")
    self.assertEqual(Decimal(2).to_roman(), "II")
    self.assertEqual(Decimal(3).to_roman(), "III")
    self.assertEqual(Decimal(5).to_roman(), "V")
    self.assertEqual(Decimal(7).to_roman(), "VII")
    self.assertEqual(Decimal(10).to_roman(), "X")
    self.assertEqual(Decimal(18).to_roman(), "XVIII")
    self.assertEqual(Decimal(30).to_roman(), "XXX")
    self.assertEqual(Decimal(4).to_roman(), "IV")
    self.assertEqual(Decimal(9).to_roman(), "IX")

    self.assertEqual(Decimal(1984).to_roman(), "MCMLXXXIV")
    self.assertEqual(Decimal(3999).to_roman(), "MMMCMXCIX")
    self.assertEqual(Decimal(640).to_roman(), "DCXL")
