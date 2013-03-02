; replce [sketch name] with the name of this sketch
(ns generative-art.listing-3-2a
	(:use quil.core))

(defn setup []
	(background 150)
	; code to draw whatever...
	(let [step 10
		  border 20
		  xs (range border 480 step)
		  y 50]
		  (reduce
		  	(fn [lastx x]
		  		(line x y lastx y)
		  		x)
		  	xs)
		  )
	)

; replace sketch-name with your sketch name
(defn -main []
	(sketch
		:title "listing-3-2a"
		:setup setup
		:size [800 600]))
