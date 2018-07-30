(ns roman-numerals.core-test
  (:require [clojure.test :refer :all]
            [roman-numerals.core :refer :all]))

(deftest a-test
  (testing "Roman of 0 is ''"
           (is (= (roman-of 0) ""))))

(deftest a-test
  (testing "Roman of 1 is 'I'"
           (is (= (roman-of 1) "I"))))

(deftest a-test
  (testing "Roman of 2 is 'II'"
           (is (= (roman-of 2) "II"))))

(deftest a-test
  (testing "Roman of 3 is 'III'"
           (is (= (roman-of 3) "III"))))