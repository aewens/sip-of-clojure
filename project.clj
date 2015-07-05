(defproject sip-of-clojure "0.1.0-SNAPSHOT"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot sip-of-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
