(ns fizzbuzz.core-test
    (:require [clojure.test :refer :all]
      [fizzbuzz.core :refer :all]))

(deftest fizzbuzz-test
         (testing "fizzbuzz of"
                  (is (= (fizzbuzz 1) "1"))
                  (is (= (fizzbuzz 2) "2"))
                  (is (= (fizzbuzz 3) "fizz"))
                  (is (= (fizzbuzz 5) "buzz"))
                  (is (= (fizzbuzz 6) "fizz"))
                  (is (= (fizzbuzz 10) "buzz"))
                  (is (= (fizzbuzz 15) "fizzbuzz"))
                  (is (= (fizzbuzz-to 10) '("1" "2" "fizz" "4" "buzz" "fizz" "7" "8" "fizz" "buzz")))
                  ))