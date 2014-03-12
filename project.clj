(defproject skeletom "0.1.0-SNAPSHOT"
  :description "Boilerplate ClojureScript application with Om"
  :url "https://github.com/StepanKuzmin/skeletom"
  :dependencies [[org.clojure/clojurescript "0.0-2173"]
                 [om "0.5.2"]
                 [com.facebook/react "0.9.0"]]
  :plugins [[lein-cljsbuild "1.0.2"]]
  :source-paths ["src"]
  :cljsbuild {
    :builds [{
      :id "development"
      :source-paths ["src"]
      :compiler {
        :output-to "public/js/app.js"
        :output-dir "public/js"
        :optimizations :none
        :source-map true}}]})
