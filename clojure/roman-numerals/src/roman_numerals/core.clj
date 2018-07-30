(ns roman-numerals.core
  (:gen-class))

(defn roman-of [arabic]
  (cond
    (= arabic 3) "III"
    (= arabic 2) "II"
    (= arabic 1) "I"
    :default ""))

(def decimal 1)
(def roman (roman-of decimal))

(defn -main
  "Converts Arabic to Roman numeral"
  [& args]
  (println (str "Roman of " (str decimal) ": " roman)))
