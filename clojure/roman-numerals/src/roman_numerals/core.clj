(ns roman-numerals.core
  (:gen-class))



(defn roman-of-rec [arabic, map]
  (cond
    (<= arabic 0) ""
    (contains? map arabic) (map arabic)
    :default (cond
               (> arabic (first (first map))) (str (roman-of-rec (first (first map)) map) (roman-of-rec (- arabic (first (first map))) map))
               (= arabic (first (first map))) (str (roman-of-rec (first (first map)) map) (roman-of-rec (- arabic (first (first map))) (rest map)))
;               (>= arabic 50) (str (roman-of-rec 50 map) (roman-of-rec (- arabic 50) map))
               (>= arabic 10) (str (roman-of-rec 10 map) (roman-of-rec (- arabic 10) map))
               (>= arabic 5) (str (roman-of-rec 5 map) (roman-of-rec (- arabic 5) map))
               (>= arabic 1) (str (roman-of-rec 1 map) (roman-of-rec (- arabic 1) map))
               ;:default (str (roman-of-rec 1 map) (roman-of-rec (- arabic 1) map)))
               :default (roman-of-rec arabic (rest map)))
    ))

(def arabic-to-roman
  {
    50 "L",
    10 "X",
    5 "V",
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
