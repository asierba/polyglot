from collections import OrderedDict

class Decimal :
  roman_to_numerals = sorted({ 
      "M" : 1000,
      "CM" : 900,
      "D" : 500,
      "CD" : 400,
      "C" : 100,
      "XC" : 90,
      "XL" : 40,
      "L" : 50,
      "X" : 10,
      "IX" : 9,
      "V": 5,
      "IV": 4,
      "I" : 1
  }.items(), key=lambda t: t[1], reverse=True)

  def __init__(self, value) :
    self._value = value
  
  def to_roman(self):
    decimal = self._value
    result = ""
    for key, value in self.roman_to_numerals :
      while (decimal >= value) :
        result += key
        decimal -= value

    return result
