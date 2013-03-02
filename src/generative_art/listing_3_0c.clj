; replce [sketch name] with the name of this sketch
(ns generative-art.listing-3-4
	(:use quil.core))

(defn setup []
	(background 150)
	(let [xstep 10
	      starty 50
	      borderx 20
	      get-y (fn [] (- (random 20) 10)) 
	      xs (range borderx (- (width) borderx) xstep)
	      yoffsets (repeatedly (count xs) get-y)
	      ys (reductions (fn [y ystep] (+ y ystep)) starty yoffsets)
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
		:title "listing 3-4"
		:setup setup
		:size [800 600]))
