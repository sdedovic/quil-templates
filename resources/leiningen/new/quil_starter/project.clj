(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://example.com/FIXME"
  :license {:name "Apache License, Version 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.dedovic/artlib-core "0.0.15"]
                 [com.dedovic/easings-clj "0.1.0"]
                 [genartlib/genartlib "1.0.0"]] ; utility functions
  :repl-options {
                 :welcome (println "Welcome to the Quil starter. The 'sketch.core ns has been loaded. The sketch may be run with (start!)")
                 :init-ns sketch.core
                 :init (start!)
                 }
  :jvm-opts ["-Xms4000m" "-Xmx4000M" ; 4GB heap size
             "-server"
             "-Dsun.java2d.uiScale=1.0"] ; adjust scaling for high DPI displays
  :source-paths ["src/clj"]
  :java-source-paths ["src/java"]
  :resource-paths ["resources"])
