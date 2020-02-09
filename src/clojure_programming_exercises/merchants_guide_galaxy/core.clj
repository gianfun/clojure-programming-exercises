(ns clojure-programming-exercises.merchants-guide-galaxy.core
  )

(defn say
  "prints anything"
  []
  (println "Whats dup"))

(defn roman-single->int
  "Converts a single roman numeral into an int"
  [roman]
  ({"i" 1 "v" 5 "x" 10 "l" 50 "c" 100 "d" 500 "m" 1000} (clojure.string/lower-case roman)))


(defn subtract-if-smaller
  "returns -a if a<b else a. Used in Roman numeral 'subtracting' (ex. IV -> 4)"
  [[a b]]
  (if (< a b) (- a) a))  

(defn roman->int
  "Converts roman numeral string into an int"
  [roman-string]
  (let [char-to-int (apply vector (map roman-single->int roman-string))
        padded (conj char-to-int 0)
        pairs (partition 2 1 padded)
        pair-values (map subtract-if-smaller pairs)
        final (apply + pair-values)]
    final))
