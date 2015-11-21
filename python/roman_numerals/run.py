#!/usr/bin/python
import sys
from decimal import Decimal 

if (len(sys.argv) > 1) :
  number = int(sys.argv[1])
else :
  number = input("Decimal: ")
  
roman = Decimal(number).to_roman()
print "Roman: " + repr(roman)
