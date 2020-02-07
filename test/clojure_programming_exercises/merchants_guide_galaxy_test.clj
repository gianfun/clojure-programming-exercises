(ns clojure-programming-exercises.merchants-guide-galaxy-test
  (:require [midje.sweet :refer :all]) 
  (:require [clojure-programming-exercises.merchants-guide-galaxy.core :refer :all]))


(tabular
 (fact "We can convert roman numerals to int"
       (roman->int ?roman) => ?int)
 ?roman  ?int
 "V"     5
 "I"     1
 "III"   3
 "IV"    4
 "L"     50
 "LXIV"  62
 "XLII"  42
 "MCMXLIV" 1944)

(tabular
 (fact "We can convert a single roman numeral to an int"
       (roman-single->int ?roman) => ?int)
 ?roman  ?int
 "I"     1
 "V"     5
 "X"     10
 "L"     50
 "C"     100
 "D"     500
 "M"     1000)
      
(tabular
 (fact "We can convert roman pairs into ints"
       (get-roman-pair-value ?a ?b) => ?res)
 ?a   ?b   ?res
 "I"  "V"  4
 "V"  "I"  5
 "I"  "I"  1
 "X"  "C"  90
 "I"  "X"  9)
