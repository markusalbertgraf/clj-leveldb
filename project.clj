(defproject org.clojars.markus/clj-leveldb "0.1.2.1"
  :description "an idiomatic wrapper for java only LevelDB forked from factual"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[byte-streams "0.2.4"]
                 [org.iq80.leveldb/leveldb "0.12"]
                 [org.iq80.leveldb/leveldb-api "0.12"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.1"]
                                  [criterium "0.4.5"]
                                  [codox-md "0.2.0" :exclusions [org.clojure/clojure]]]}}
  :plugins [[codox "0.6.4"]]
  :codox {:writer codox-md.writer/write-docs
          :include [clj-leveldb]})
