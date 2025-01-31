(ns sketch.core
  (:require [artlib.quil.middleware :refer [animation-mode]]
            [clojure.core.matrix :refer [set-current-implementation]]
            [quil.middleware :as qm]
            [sketch.dynamic :as dynamic]
            [quil.core :as q]))

(defn start! []
  (q/defsketch example
             :title "{{name}}"
             :setup (fn [] {})
             :draw dynamic/draw
             :update identity
             :size [800 800]
             :animation {:render? false :dirname "1"}
             :middleware [qm/fun-mode animation-mode]))

#_(start!)
