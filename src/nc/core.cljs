(ns nc.core
  (:require [cljs.nodejs :as nodejs]))


(nodejs/enable-util-print!)

(println "Hello from node (global)")

(defn -main [& args]
  (println "Hello from node (main)"))

(set! *main-cli-fn* -main)
