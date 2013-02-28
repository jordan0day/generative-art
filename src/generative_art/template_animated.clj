; replce [sketch name] with the name of this sketch
(ns generative-art.[sketch name]
	(:use quil.core))

(defn setup []
	(background 150)
	; code to draw whatever...
	)

(defn draw []
	; code to draw per frame
	)

; replace sketch-name with your sketch name
(defn -main []
	(sketch
		:title "sketch name"
		:setup setup
		:draw draw
		:size [800 600]))