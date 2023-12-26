(ns sketch.core
  (:require [quil.core :as q]
            [quil.middleware :as qm]
            [artlib.quil.middleware :refer [animation-mode]]
            [sketch.dynamic :as dynamic]))

(q/defsketch example
             :title "{{name}}"
             :setup (fn [] {})
             :draw dynamic/draw
             :update identity
             :size [800 800]
             :animation {:render? false :dirname "EXAMPLE/1"}
             :middleware [qm/fun-mode animation-mode])

