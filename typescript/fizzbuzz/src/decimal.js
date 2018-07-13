"use strict";
exports.__esModule = true;
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
exports.Decimal = Decimal;
