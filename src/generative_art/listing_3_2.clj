; replce [sketch name] with the name of this sketch
(ns generative-art.listing-3-2
	(:use quil.core))

(defn setup []
	(background 150)
	(let [xs (range 20 500 1)
		  radians (map radians (range 0 (count xs)))
		  ys (map (fn [rad] (+ 50 (* 40 (sin rad)))) radians)
		  coords (map (fn [x y] {:x x :y y}) xs ys)]

		(reduce 
			(fn [last new]
				(line (:x new) (:y new) (:x last) (:y last))
				new) coords)
		)
	)

; replace sketch-name with your sketch name
(defn -main []
	(sketch
		:title "listing-3-2"
		:setup setup
		:size [500 500]))
