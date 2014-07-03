(ns skeletom.app
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [ankha.core :as ankha]))

(enable-console-print!)

(om/root
 ankha/inspector
 {:points [{:x 1 :y 0}
           {:x 0 :y 1}
           {:x -1 :y 0}
           {:x 0 :y -1}]}

 {:target (js/document.getElementById "app")})
