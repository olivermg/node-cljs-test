
run-ii:
	NODE_PATH=./target node ii.js

run-nc:
	NODE_PATH=./lib node target/nc.js

repl:
	rlwrap lein figwheel

.PHONY: run-ii run-nc repl

