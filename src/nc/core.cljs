(ns nc.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(def jj (nodejs/require "jj"))
(println "jj:" jj)

(println "Hello from nc.core (global cljs)")


(defn ^:export libfn [x]
  (println "Hello from nc.core.libfn (local cljs)")
  (inc (.jj jj x)))


(defprotocol Proto1
  (^:export protofn [this x]))

(defrecord ProtoRec1 [y]
  Proto1
  (protofn [this x]
    (println "Hello from Proto1/protofn function, implemented in ProtoRec1 (local cljs)")
    (+ x y)))

(defn ^:export new-protorec1 [y]
  (->ProtoRec1 y))



;;; for run-cljs Makefile target:

(defn -main [& args]
  (println "Hello from nc.core.main (local cljs)"))

(set! *main-cli-fn* -main)
