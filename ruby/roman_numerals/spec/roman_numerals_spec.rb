require 'spec_helper'
require 'fixnum'

describe "decimal to roman" do
  it "converts decimal to roman" do
    expect(1.to_roman).to eq("I")
    expect(2.to_roman).to eq("II")
    expect(3.to_roman).to eq("III")
    expect(5.to_roman).to eq("V")
    expect(7.to_roman).to eq("VII")
    expect(10.to_roman).to eq("X")
    expect(18.to_roman).to eq("XVIII")
    expect(30.to_roman).to eq("XXX")
    expect(4.to_roman).to eq("IV")
    expect(9.to_roman).to eq("IX")
    
    expect(1984.to_roman).to eq("MCMLXXXIV")
    expect(3999.to_roman).to eq("MMMCMXCIX")
  end
end
