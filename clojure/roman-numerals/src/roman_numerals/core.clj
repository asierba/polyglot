(ns roman-numerals.core
  (:gen-class))

(def arabic-to-roman
  {10 "X",
   5 "V",
   1 "I",
   }
  )

(defn roman-of [arabic]
  (cond
    (<= arabic 0) ""
    (contains? arabic-to-roman arabic) (arabic-to-roman arabic)
    :default (cond
               (= arabic 20) (str (roman-of 10) (roman-of 10))
               (= arabic 15) (str (roman-of (- arabic 5)) (roman-of 5))
               :default (str (roman-of (- arabic 1)) (roman-of 1)))
              ))

(def decimal 1)
(def roman (roman-of decimal))

(defn -main
  "Converts Arabic to Roman numeral"
  [& args]
  (println (str "Roman of " (str decimal) ": " roman)))
