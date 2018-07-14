
class ArabicRomanPair {
    public arabic: number;
    public roman: string;

    constructor(pair:Array<any>) {
        this.arabic = pair[0];
        this.roman = pair[1];
    }
}

class ArabicToRomanDictionary {
    private defaultItems = new Map<number, string>([
        [1000, 'M'],
        [500, 'D'],
        [400, 'CD'],
        [100, 'C'],
        [90, 'XC'],
        [50, 'L'],
        [40, 'XL'],
        [10, 'X'],
        [9, 'IX'],
        [5, 'V'],
        [4, 'IV'],
        [1, 'I']
    ]);

    private items: Map<number, string>;

    constructor(items: Map<number, string> = null) {
        this.items = items === null ? this.defaultItems : items;
    }

    getFirst() : ArabicRomanPair {
        const value = this.items.entries().next().value;
        return new ArabicRomanPair(value);
    }

    removeFirst() : ArabicToRomanDictionary {
        const newItems = new Map(Array.from(this.items.entries()).splice(1));
        return new ArabicToRomanDictionary(newItems);
    }
}


function roman_of(arabic:number, dictionary = new ArabicToRomanDictionary()) : string {
    if (arabic <= 0)
        return '';

    const { arabic: currentArabic, roman: currentRoman} = dictionary.getFirst();
    if (arabic >= currentArabic) {
        return currentRoman + roman_of(arabic-currentArabic);
    }

    return roman_of(arabic, dictionary.removeFirst());
}

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