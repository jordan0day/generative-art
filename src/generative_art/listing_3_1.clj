; replce [sketch name] with the name of this sketch
(ns generative-art.listing-3-1
	(:use quil.core))

(defn setup []
	(background 255)
	(stroke-weight 5)
	(smooth)

	(stroke 0 30)
	(line 20 50 480 50)

	(stroke 20 50 70)
	(let [step 10
		  noise-start (random 10)
		  xs (range 20 480 step)
		  ys (map 
		  		(fn [ynoise]
		  			(+ 10 (* 80 (noise ynoise))))
		  		(range 
		  			noise-start
		  			(+ noise-start (* 0.1 (count xs)))
		  			0.1))
		  coords (map (fn [x y] {:x x :y y}) xs ys)]
		(reduce 
			(fn [last new]
				(line (:x new) (:y new) (:x last) (:y last))
				new) coords)
		  )
	; code to draw whatever...
	)

; replace sketch-name with your sketch name
(defn -main []
	(sketch
		:title "listing 3.1 (perlin noise)"
		:setup setup
		:size [500 500]))
