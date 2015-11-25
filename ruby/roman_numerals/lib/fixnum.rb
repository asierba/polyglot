class Fixnum
  @@roman_to_numeral = {
    :M => 1000,
    :CM => 900,
    :D => 500,
    :CD => 400,
    :C => 100,
    :XC => 90,
    :L => 50,
    :XL => 40,
    :X => 10,
    :IX => 9,
    :V => 5,
    :IV => 4,
    :I => 1
  }

  def to_roman
    result = ""
    decimal = self
    @@roman_to_numeral.each do |key, value|
      while (decimal >= value)
        result += key.to_s
        decimal -= value
      end
    end
    result
  end
end
