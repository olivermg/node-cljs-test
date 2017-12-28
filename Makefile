
run-node:
	NODE_PATH=./target node ii.js

run-cljs:
	NODE_PATH=./lib node target/nc.js

repl:
	rlwrap lein figwheel

.PHONY: run-node run-cljs repl

