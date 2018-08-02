(ns roman-numerals.core
  (:gen-class))

(defn rest-map [map] (dissoc map (apply max (keys map))))
(defn get-next-key [map] (apply max (keys map)))

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

(defn roman-of
  ([arabic] (roman-of arabic arabic-to-roman))
  ([arabic map]
   (cond
     (<= arabic 0) ""
     (contains? map arabic) (map arabic)
     (>= arabic (get-next-key map)) (str (roman-of (get-next-key map) map) (roman-of (- arabic (get-next-key map)) map))
     :default (roman-of arabic (rest-map map)))))

(defn -main
  "Converts Arabic to Roman numeral"
  [& args]
  (def arabic (read-string (read-line)))
  (println (str "Roman of " (str arabic) ": " (roman-of arabic))))
