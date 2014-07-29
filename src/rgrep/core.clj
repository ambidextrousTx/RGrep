(ns rgrep.core
  (:require [clojure.tools.cli :refer [cli]])
  (:gen-class))

(defn help
  "Generic help about RGrep"
  []
  (println "A Grep clone written in Clojure"))

(defn -main [& args]
  (let [[opts args banner] (cli args
                             ["-h" "--help" "Print this help"
                              :default false :flag true])]
    (when (:help opts)
      (println banner))))
