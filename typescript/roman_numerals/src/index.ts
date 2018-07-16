import {roman_of} from "../src/roman";
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Roman of:', (arabic) => {
    const roman = roman_of(arabic);
    console.log(`is '${roman}'`);
});
