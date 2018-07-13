"use strict";
exports.__esModule = true;
var decimal_1 = require("./decimal");
for (var i = 1; i <= 100; i++) {
    console.log(new decimal_1.Decimal(i).toFizzbuzz().toString());
}
