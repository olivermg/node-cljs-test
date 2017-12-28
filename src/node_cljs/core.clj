(ns node-cljs.core
  (:require [cljs.nodejs :as nodejs]))


(nodejs/enable-util-print!)

(println "Hello from node (global)")

(defn -main []
  (println "Hello from node (main)"))

(set! *main-cli-fn* -main)
