import {roman_of} from "../src/roman";

describe("Roman of", () => {
    [
        {arabic: 0, roman: '' },
        {arabic: -3, roman: '' },
        {arabic: 1, roman: 'I' },
        {arabic: 2, roman: 'II' },
        {arabic: 3, roman: 'III' },
        {arabic: 5, roman: 'V' },
        {arabic: 6, roman: 'VI' },
        {arabic: 7, roman: 'VII' },
        {arabic: 8, roman: 'VIII' },
        {arabic: 10, roman: 'X' },
        {arabic: 17, roman: 'XVII' },
        {arabic: 20, roman: 'XX' },
        {arabic: 4, roman: 'IV' },
        {arabic: 9, roman: 'IX' },
        {arabic: 40, roman: 'XL' },
        {arabic: 50, roman: 'L' },
        {arabic: 90, roman: 'XC' },
        {arabic: 100, roman: 'C' },
        {arabic: 400, roman: 'CD' },
        {arabic: 500, roman: 'D' },
        {arabic: 1000, roman: 'M' },
        {arabic: 3888, roman: 'MMMDCCCLXXXVIII' },
    ].forEach(data => {
        it(`${data.arabic} should be ${data.roman}`, () => {
            expect(roman_of(data.arabic)).toBe(data.roman);
        })});
});
