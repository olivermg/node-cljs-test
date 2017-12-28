(require 'cljs.build.api)

(cljs.build.api/build "src"
                      {:main 'nc.core
                       :output-to "target/nc.js"
                       :output-dir "target"
                       :target :nodejs
                       :optimizations :none
                       :pretty-print true
                       :source-map true
                       :parallel-build true
                       })
