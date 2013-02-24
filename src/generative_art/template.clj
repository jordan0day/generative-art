; replce [sketch name] with the name of this sketch
(ns generative-art.[sketch name]
	(:use quil.core))

(defn setup []
	(background 150)
	; code to draw whatever...
	)

; replace sketch-name with your sketch name
(defsketch sketch-name
	:title "sketh name"
	:setup setup
	:size [640 480])
