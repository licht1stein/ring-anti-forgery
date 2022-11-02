(defproject ring/ring-anti-forgery "1.3.0"
  :description "Ring middleware to prevent CSRF attacks"
  :url "https://github.com/ring-clojure/ring-anti-forgery"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [crypto-random "1.2.0"]
                 [crypto-equality "1.0.0"]
                 [hiccup "2.0.0-alpha2"]]
  :plugins [[lein-codox "0.10.3"]]
  :codox
  {:output-path "codox"
   :project     {:name "Ring Anti-Forgery"}
   :source-uri  "http://github.com/ring-clojure/ring-anti-forgery/blob/{version}/{filepath}#L{line}"}
  :aliases {"test-all" ["with-profile" "default:+1.6:+1.7:+1.8:+1.9" "test"]}
  :profiles
  {:dev {:dependencies [[ring/ring-mock "0.3.2"]]}
   :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
   :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
   :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
   :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}})
