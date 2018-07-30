(ns roman-numerals.core-test
  (:require [clojure.test :refer :all]
            [roman-numerals.core :refer :all]))

(deftest roman-of-arabic
  (testing "Roman of arabic"
           (is (= (roman-of 0) ""))
           (is (= (roman-of 1) "I"))
           (is (= (roman-of 2) "II"))
           (is (= (roman-of 3) "III"))
           ))
