class Fizz {
    toString() {
        return "Fizz";
    }
}
class Buzz {
    toString() {
        return "Buzz";
    }
}
class FizzBuzz {
    toString() {
        return "FizzBuzz";
    }
}

class Decimal {
    value:number;
    constructor(value:number) {
        this.value = value;
    }
    toFizzbuzz() : number | Fizz | Buzz | FizzBuzz {
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
    }

    private isDivisibleBy(number:number) : boolean {
        return this.value % number === 0;
    }
}

describe('Decimal to fizzbuzz', () => {
    [
        { input: 1, expected: "1" },
        { input: 2, expected: "2" },
        { input: 3, expected: "Fizz" },
        { input: 4, expected: "4" },
        { input: 5, expected: "Buzz" },
        { input: 6, expected: "Fizz" },
        { input: 10, expected: "Buzz" },
        { input: 15, expected: "FizzBuzz" },
    ].forEach(data =>
    it(`should convert ${data.input} to ${data.expected} `, () => {
        let number = new Decimal(data.input);
        let result = number.toFizzbuzz();
        expect(data.expected).toBe(result.toString());
    }));
});