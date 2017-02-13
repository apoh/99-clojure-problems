(defproject ninety-nine-clojure-problems "0.1.0-SNAPSHOT"
  :description "99 Clojure Problems"
  :url "http://github.com/apoh"
  :license {:name "THE BEER-WARE LICENS"
            :url "https://fedoraproject.org/wiki/Licensing/Beerware"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot ninety-nine-clojure-problems.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
