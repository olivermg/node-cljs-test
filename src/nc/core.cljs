(ns nc.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(def jj (nodejs/require "jj"))
(println "jj:" jj)

(println "Hello from nc.core (global cljs)")


(defn ^:export libfn [x]
  (println "Hello from nc.core.libfn (local cljs)")
  (inc (.jj jj x)))



;;; for run-cljs Makefile target:

(defn -main [& args]
  (println "Hello from nc.core.main (local cljs)"))

(set! *main-cli-fn* -main)
