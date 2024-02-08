(defproject org.clojars.csdream/lein-elastic-beanstalk "0.2.9-SNAPSHOT"
  :description "Leiningen plugin for Amazon's Elastic Beanstalk"
  :url "https://github.com/csdream/lein-elastic-beanstalk"
  :license {:name "MIT"
            :url "https://choosealicense.com/licenses/mit"
            :key "mit"
            :year 2024
            :comment "MIT License"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [com.amazonaws/aws-java-sdk "1.6.10"]
                 [lein-ring "0.8.2"]]
  :eval-in-leiningen true)
