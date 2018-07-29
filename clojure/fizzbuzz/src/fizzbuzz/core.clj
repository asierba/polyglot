(ns fizzbuzz.core
    (:gen-class))

(defn multiple-of? [n, m]
      (= (mod n m) 0))

(defn fizzbuzz [number]
      (cond
        (multiple-of? number 15) "fizzbuzz"
        (multiple-of? number 5) "buzz"
        (multiple-of? number 3) "fizz"
        :else (str number)))
(defn fizzbuzz-to [to]
      (map #(fizzbuzz %) (range 1 (inc to))))

(defn -main
      "Fizzbuzz from 1 to 10"
      [& args]
      (println (fizzbuzz-to 100)))
