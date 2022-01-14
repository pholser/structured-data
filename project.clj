(defproject structured-data "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [iloveponies.tests/structured-data "0.2.0-SNAPSHOT"]
                 [inflections "0.13.2"]]
  :profiles {:dev {:plugins [[lein-midje "3.2.1"]]}})

