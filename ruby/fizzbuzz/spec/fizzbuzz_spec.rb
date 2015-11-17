require 'spec_helper'
require 'fizzbuzz_converter'

describe "FizzBuzzConverter" do
  it "should convert numbers to fizzbuzz" do
    expect(FizzBuzzConverter.convert 1).to eq 1
    expect(FizzBuzzConverter.convert 2).to eq 2
    expect(FizzBuzzConverter.convert 3).to eq "fizz"
    expect(FizzBuzzConverter.convert 5).to eq "buzz"
    expect(FizzBuzzConverter.convert 6).to eq "fizz"
    expect(FizzBuzzConverter.convert 10).to eq "buzz"
    expect(FizzBuzzConverter.convert 15).to eq "fizzbuzz"
  end
end
