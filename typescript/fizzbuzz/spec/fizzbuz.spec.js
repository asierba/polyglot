var Fizz = /** @class */ (function () {
    function Fizz() {
    }
    Fizz.prototype.toString = function () {
        return "Fizz";
    };
    return Fizz;
}());
var Buzz = /** @class */ (function () {
    function Buzz() {
    }
    Buzz.prototype.toString = function () {
        return "Buzz";
    };
    return Buzz;
}());
var FizzBuzz = /** @class */ (function () {
    function FizzBuzz() {
    }
    FizzBuzz.prototype.toString = function () {
        return "FizzBuzz";
    };
    return FizzBuzz;
}());
var Decimal = /** @class */ (function () {
    function Decimal(value) {
        this.value = value;
    }
    Decimal.prototype.toFizzbuzz = function () {
        if (this.isDivisibleBy(15)) {
            return new FizzBuzz();
        }
        if (this.isDivisibleBy(3)) {
            return new Fizz();
        }
        if (this.isDivisibleBy(5)) {
            return new Buzz();
        }
        return this.value;
    };
    Decimal.prototype.isDivisibleBy = function (number) {
        return this.value % number === 0;
    };
    return Decimal;
}());
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
            var number = new Decimal(data.input);
            var result = number.toFizzbuzz();
            expect(data.expected).toBe(result.toString());
        });
    });
});
