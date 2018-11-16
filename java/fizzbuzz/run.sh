#!/usr/bin/env bash
rm -rf out
javac -d out src/main/java/asierba/fizzbuzz/FizzBuzz.java src/main/java/asierba/fizzbuzz/Main.java
cd out && java asierba.fizzbuzz.Main
