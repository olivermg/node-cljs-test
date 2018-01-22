run:
	NODE_PATH=./target:./lib node ii.js

run-cljs:
	NODE_PATH=./lib node target/nc.js


build:
	lein cljsbuild once


repl:
	rlwrap lein figwheel


.PHONY: run run-node run-cljs build repl
