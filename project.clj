(defproject node-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.946"]]

  :plugins [[lein-cljsbuild "1.1.7"]]

  :clean-targets ^{:protect false} ["target"]

  :cljsbuild {:builds [{:id "node-cljs-dev"
                        :source-paths ["src"]
                        :compiler {:main node-cljs.core
                                   :output-to "target/node-cljs.js"
                                   :output-dir "target"
                                   :target :nodejs
                                   :optimizations :none
                                   :source-map true}}]})
