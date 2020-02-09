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
 "LXIV"  64
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
 (fact "We subtract if the first number is smaller than the second"
       (subtract-if-smaller [?a ?b]) => ?res)
 ?a   ?b   ?res
 1    5    -1
 5    1    5
 1    1    1
 10   100  -10
 1    10   -1)
