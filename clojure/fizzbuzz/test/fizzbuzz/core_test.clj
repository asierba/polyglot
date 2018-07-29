(ns fizzbuzz.core-test
    (:require [clojure.test :refer :all]
      [fizzbuzz.core :refer :all]))

(deftest a-test
         (testing "fizzbuzz of 1 is 1"
                  (is (= (fizzbuzz 1) "1"))))

(deftest a-test
         (testing "fizzbuzz of 2 is 2"
                  (is (= (fizzbuzz 2) "2"))))

(deftest a-test
         (testing "fizzbuzz of 3 is fizz"
                  (is (= (fizzbuzz 3) "fizz"))))

(deftest a-test
         (testing "fizzbuzz of 5 is buzz"
                  (is (= (fizzbuzz 5) "buzz"))))

(deftest a-test
         (testing "fizzbuzz of 6 is fizz"
                  (is (= (fizzbuzz 6) "fizz"))))

(deftest a-test
         (testing "fizzbuzz of 10 is buzz"
                  (is (= (fizzbuzz 10) "buzz"))))

(deftest a-test
         (testing "fizzbuzz of 15 is fizzbuzz"
                  (is (= (fizzbuzz 15) "fizzbuzz"))))

(deftest a-test
         (testing "fizzbuzz from 1 to 10"
                  (is (= (fizzbuzz-to 10) '("1" "2" "fizz" "4" "buzz" "fizz" "7" "8" "fizz" "buzz")))))