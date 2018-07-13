"use strict";
exports.__esModule = true;
var decimal_1 = require("../src/decimal");
describe('Decimal to fizzbuzz', function () {
    [
        { input: 1, expected: "1" },
        { input: 2, expected: "2" },
        { input: 3, expected: "Fizz" },
        { input: 4, expected: "4" },
        { input: 5, expected: "Buzz" },
        { input: 6, expected: "Fizz" },
        { input: 10, expected: "Buzz" },
        { input: 15, expected: "FizzBuzz" },
    ].forEach(function (data) {
        return it("should convert " + data.input + " to " + data.expected + " ", function () {
            var number = new decimal_1.Decimal(data.input);
            var result = number.toFizzbuzz();
            expect(data.expected).toBe(result.toString());
        });
    });
});
