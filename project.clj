;; The only requirement of the project.clj file is that it includes a
;; defproject form. It can have other code in it as well, including
;; loading other task definitions.

(defproject leiningen "1.4.0-SNAPSHOT"
  :description "A build tool designed not to set your hair on fire."
  :url "http://github.com/technomancy/leiningen"
  :license {:name "Eclipse Public License"}
  :dependencies [[org.clojure/clojure "1.3.0-alpha1"]
                 [org.clojure.contrib/complete "1.3.0-alpha1" :classifier "bin"]
                 [ant/ant "1.7.1"]
                 [jline "0.9.94"]
                 [robert/hooke "1.0.2"]
                 [org.apache.maven/maven-ant-tasks "2.0.10"
                  :exclusions [ant/ant]]]
  :disable-implicit-clean true
  :eval-in-leiningen true)
