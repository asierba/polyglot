(ns kataskeleton.core-test
    (:require [clojure.test :refer :all]
      [kataskeleton.core :refer :all]))

(defn multiple-of? [n, m]
      (= (mod n m) 0))

(defn fizzbuzz [number]
      (cond
        (multiple-of? number 15) "fizzbuzz"
        (multiple-of? number 5) "buzz"
        (multiple-of? number 3) "fizz"
        :else (str number)))

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