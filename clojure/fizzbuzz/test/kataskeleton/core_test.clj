(ns kataskeleton.core-test
  (:require [clojure.test :refer :all]
            [kataskeleton.core :refer :all]))

(defn fizzbuzz  [number]  
  (if (= number 3) "fizz" (str number)))

(deftest a-test
  (testing "fizzbuzz of 1 is 1"
    (is (= (fizzbuzz 1) "1"))))

(deftest a-test
  (testing "fizzbuzz of 2 is 2"
    (is (= (fizzbuzz 2) "2"))))

(deftest a-test
  (testing "fizzbuzz of 3 is fizz"
    (is (= (fizzbuzz 3) "fizz"))))
