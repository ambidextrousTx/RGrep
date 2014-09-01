(ns rgrep.core)
(require 'clojure.string)

(defn match [x y]
  "Looks for a direct match between two strings"
  (= x y))

(defn nomatch [x y]
  "Looks for direct mismatch"
  (not(= x y)))

(defn match-case-insensitive [x y]
  "Match case-insensitively"
  (= (clojure.string/lower-case x) (clojure.string/lower-case y)))

(defn get-count [x y]
  "Only get a count of the matches. Assume x is the pattern"
  (count
    (filter
      (fn [z] (match z x))
      (clojure.string/split-lines y))))
