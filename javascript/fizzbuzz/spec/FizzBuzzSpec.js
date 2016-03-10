describe("FizzBuzz", function() {
  it("of a number divisible by three is fizz", function() {
    expect(fizzbuzz.of(3)).toEqual("fizz");
    expect(fizzbuzz.of(6)).toEqual("fizz");
    expect(fizzbuzz.of(9)).toEqual("fizz");
  });
  it("of a number divisible by five is buzz", function() {
    expect(fizzbuzz.of(5)).toEqual("buzz");
    expect(fizzbuzz.of(10)).toEqual("buzz");
    expect(fizzbuzz.of(20)).toEqual("buzz");
  });
  it("of a number divisible by fifteen is fizzbuzz", function() {
    expect(fizzbuzz.of(15)).toEqual("fizzbuzz");
    expect(fizzbuzz.of(30)).toEqual("fizzbuzz");
  });
  it("of any other number is the number", function() {
    expect(fizzbuzz.of(1)).toEqual(1);
    expect(fizzbuzz.of(2)).toEqual(2);
    expect(fizzbuzz.of(1388)).toEqual(1388);
  });
});
