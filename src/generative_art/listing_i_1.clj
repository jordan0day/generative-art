(ns generative-art.listing-i-1
	(:use quil.core))

(defn draw-point [x y noisefactor]
	(push-matrix)
	(translate (* x noisefactor 4) (* y noisefactor 4) (- y))
	(let [edgesize (* noisefactor 26)]
		(ellipse 0 0 edgesize edgesize))
	(pop-matrix)
)

(defn setup[]
	(prn "in setup")
	(background 150)
	(stroke 0 50)
	(fill 255 200)
	(def xstart (random 10))
	(def ynoise (random 10))
	(translate (/ (width) 2) (/ (height) 2))
	(loop [y (- (/ (height) 8))
		   ynoise (+ ynoise 0.02)
		   x (- (/ (width) 8))
		   xnoise (+ xstart 0.02)]
		(if (and
				(<= y (/ (height) 8))
				(<= x (/ (width) 8)))
			(draw-point x y (noise xnoise ynoise)))
		(if (<= y (/ (height) 8))
			(recur
				; y
				(if (> x (/ (width) 8))
					(+ y 3)
					y)
				; ynoise
				(if (> x (/ (width) 8))
					(+ ynoise 0.02)
					ynoise)
				; x
				(if (<= x (/ (width) 8))
					(+ x 3)
					(- (/ (width) 8)))
				; xnoise
				(if (<= x (/ (width) 8))
					(+ xnoise 0.02)
					xstart)
			)))
)

(defsketch listing-i-1
	:title "Listing i.1"
	:setup setup
	:size [640 480]
	:renderer :p3d)