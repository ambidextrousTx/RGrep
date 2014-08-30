(ns rgrep.core)

(defn match [x y]
  "Looks for a direct match between two strings"
  (= x y))

(defn nomatch [x y]
  "Looks for direct mismatch"
  (not(= x y)))
