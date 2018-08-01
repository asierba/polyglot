(ns roman-numerals.core-test
  (:require [clojure.test :refer :all]
            [roman-numerals.core :refer :all]))


(deftest roman-of-arabic
  (testing "Roman of arabic"
           (is (= (roman-of 0) ""))
           (is (= (roman-of -1) ""))
           (is (= (roman-of 1) "I"))
           (is (= (roman-of 2) "II"))
           (is (= (roman-of 3) "III"))
           (is (= (roman-of 5) "V"))
           (is (= (roman-of 6) "VI"))
           (is (= (roman-of 10) "X"))
           (is (= (roman-of 15) "XV"))
           (is (= (roman-of 16) "XVI"))
           (is (= (roman-of 20) "XX"))
           (is (= (roman-of 30) "XXX"))
           (is (= (roman-of 50) "L"))
           (is (= (roman-of 60) "LX"))
;           (is (= (roman-of 73) "LXXIII"))
           ))
