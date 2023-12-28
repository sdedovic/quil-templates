(defproject com.dedovic/lein-template.quil-starter "0.1.2-SNAPSHOT"
  :description "Leiningen template for a Quil starter project."
  :url "https://github.com/sdedovic/quil-templates"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version"
                   "leiningen.release/bump-version" "release"]
                  ["vcs" "commit"]
                  ["vcs" "tag" "--no-sign"] ;; TODO: start signing things
                  ["deploy"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  ["vcs" "push"]]
  :deploy-repositories [["releases"
                         {:sign-releases false 
                          :url "https://clojars.org/repo"
                          :username :env/clojars_user
                          :password :env/clojars_token}]]
  :eval-in-leiningen true)
