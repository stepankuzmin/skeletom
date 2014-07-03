(defproject skeletom "0.1.0-SNAPSHOT"
  :description "Boilerplate ClojureScript application with Om"
  :url "https://github.com/StepanKuzmin/skeletom"
  :dependencies [[org.clojure/clojurescript "0.0-2227"]
                 [com.facebook/react "0.9.0.4"]
                 [ankha "0.1.3"]
                 [om "0.6.4"]]
  :plugins [[lein-cljsbuild "1.0.3"]]
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
