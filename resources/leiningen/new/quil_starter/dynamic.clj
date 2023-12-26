(ns sketch.dynamic
  (:require ; [clojure.java.shell :refer [sh]]
            ; [genartlib.algebra :refer :all]
            ; [genartlib.curves :refer :all]
            ; [genartlib.geometry :refer :all]
            ; [genartlib.random :refer :all]
            ; [kdtree :as kd]
            [clojure.core.matrix :refer [set-current-implementation]]
            [artlib.quil.global :refer :all]
            [genartlib.util :refer [w h]]
            [quil.core :as q]))

(set-current-implementation :vectorz)
(println)
(println)

(defn draw [state]
  (q/background 0 0 100)

  (with-style
   (q/stroke 0 80 70)
   (q/fill 0 80 70)
   
   (q/triangle 
     (w 0.1) (h 0.1)
     (w 0.9) (h 0.9) 
     (w 0.1) (h 0.9))))
