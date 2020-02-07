(ns clojure-programming-exercises.merchants-guide-galaxy.core
  )

(defn say
  "prints anything"
  []
  (println "Whats dup"))



(defn get-roman-pair-value
  "returns b-a is a<b else a. Implements Roman numeral 'subtracting' (ex. IV -> 4)"
  [[a b]]
  (let [int-a (roman-single->int a)
        int-b (roman-single->int b)
        res (if (< int-a int-b) (- int-b int-a) int-a)]
    (+ res 0))
  )

(defn roman-single->int
  "Converts a single roman numeral into an int"
  [roman]
  ({"i" 1 "v" 5 "x" 10 "l" 50 "c" 100 "d" 500 "m" 1000} (clojure.string/lower-case roman)))

(defn roman->int
  "Converts roman numeral string into an int"
  [roman-string]
  (let [pairs (partition 2 1 roman-string)
        pair-values (map get-roman-pair-value pairs)
        final (apply + pair-values)]
    final))
