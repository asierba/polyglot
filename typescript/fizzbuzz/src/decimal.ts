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

export class Decimal {
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