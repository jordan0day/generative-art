; replce [sketch name] with the name of this sketch
(ns generative-art.listing-3-0b
	(:use quil.core))

(defn setup []
	(background 150)
	; code to draw whatever...
	(let [step 10
	      y 50
	      borderx 20
	      bordery 10
	      xs (range borderx (- (width) borderx) step)
	      get-y (fn [] (+ bordery (random (- (height) (* 2 bordery)))))
	      coords (map (fn [x] {:x x :y (get-y)}) xs)]
	      (reduce 
	      	(fn [last new]
	      		(line (:x new) (:y new) (:x last) (:y last))
	      		new) coords)
	     )
	)

; replace sketch-name with your sketch name
(defn -main []
	(sketch
		:title "listing 3-0b"
		:setup setup
		:size [800 600]))
