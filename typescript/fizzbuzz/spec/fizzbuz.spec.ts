import { Decimal } from '../src/decimal';

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