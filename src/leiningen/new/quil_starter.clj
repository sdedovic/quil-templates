(ns leiningen.new.quil-starter
  (:require [leiningen.new.templates :as tmpl]
            [leiningen.core.main :as main]))

(def render (tmpl/renderer "quil_starter"))

(defn quil-starter
  "Clojure template for simple Quil sketch."
  [name]
  (let [data {:name name
              :year (.getValue (java.time.Year/now))
              :sanitized (tmpl/name-to-path name)}]
    (main/info "Generating fresh 'lein new' com.dedovic/quil-starter project.")
    (tmpl/->files data
                  ["src/clj/sketch/core.clj" (render "core.clj" data)]
                  ["src/clj/sketch/dynamic.clj" (render "dynamic.clj" data)]
                  ["project.clj" (render "project.clj" data)]
                  ["LICENSE" (render "LICENSE" data)]
                  [".gitignore" (render "gitignore" data)]
                  ["README.md" (render "README.md" data)]
                  )))
