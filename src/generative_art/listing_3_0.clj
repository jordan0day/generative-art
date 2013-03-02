; replce [sketch name] with the name of this sketch
(ns generative-art.listing-3-0
	(:use quil.core))

(defn check-x? [x border]
	(< x (- (width) border)))

(defn check-lastx? [lastx]
	(> lastx -999))

(defn setup []
	(background 150)
	(let [step 10
		  border 20]
		(loop [x border
			   y 50
			   lastx -999
			   lasty -999]
			(if (and (check-x? x border) (check-lastx? lastx))
				(line x y lastx lasty))
			(if (check-x? x border)
				(recur (+ x step) y x y)))))

; replace sketch-name with your sketch name
(defn -main []
	(sketch
		:title "listing 3.0"
		:setup setup
		:size [800 600]))
