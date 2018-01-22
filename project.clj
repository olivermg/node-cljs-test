(defproject nc "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.946"]]

  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-figwheel "0.5.14"]]

  :clean-targets ^{:protect false} ["target"]

  :cljsbuild {:builds [{:id "nc-dev"
                        :source-paths ["src"]
                        :figwheel true
                        :compiler {;;;:main nc.core
                                   :output-to "target/nc.js"
                                   :output-dir "target"
                                   :source-map "target/nc.js.map"
                                   :target :nodejs
                                   ;;; in order to compile a lib callable from js, we need to at least
                                   ;;; simple optimization, otherwise the lib's exports won't be there:
                                   :optimizations :simple
                                   :pretty-print true
                                   :parallel-build true
                                   #_:foreign-libs #_[{:file "./lib/jj.js"
                                                   :provides ["jj.core"]}]
                                   #_:modules #_{:nc {:output-to "target/nc.js"
                                                  :entries #{"nc.core"}
                                                  :append "module.exports = { libfn: nc.core.libfn };"
                                                  }}
                                   }}]}

  :figwheel {})
