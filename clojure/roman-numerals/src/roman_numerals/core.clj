(ns roman-numerals.core
  (:gen-class))

(defn rest-map [map] (dissoc map (apply max (keys map))))
(defn get-next-key [map] (apply max (keys map)))

(defn roman-of-rec [arabic, map]
  (cond
    (<= arabic 0) ""
    (contains? map arabic) (map arabic)
    (>= arabic (get-next-key map)) (str (roman-of-rec (get-next-key map) map) (roman-of-rec (- arabic (get-next-key map)) map))
    :default (roman-of-rec arabic (rest-map map))))

(def arabic-to-roman
  {
    1000 "M",
    900 "CM",
    500 "D",
    400 "CD",
    100 "C",
    90 "XC",
    50 "L",
    40 "XL",
    10 "X",
    9 "IX",
    5 "V",
    4 "IV",
    1 "I",
    }
  )

(defn roman-of [arabic]
  (roman-of-rec arabic arabic-to-roman))

(def decimal 1)
(def roman (roman-of decimal))

(defn -main
  "Converts Arabic to Roman numeral"
  [& args]
  (println (str "Roman of " (str decimal) ": " roman)))
