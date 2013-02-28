(ns generative-art.core
	(:use quil.core))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main [& args]
	(sketch :setup (fn [] (background 20) (ellipse 50 50 80 80)) :title "The moon delights the night"))
