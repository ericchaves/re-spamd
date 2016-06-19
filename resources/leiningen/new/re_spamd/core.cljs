(ns respa.core 
  (:require [reagent.core :as reagent :refer [atom]] 
            [re-frame.core :refer [dispatch dispatch-sync]]
            [secretary.core :as secretary] 
            [respa.routes :as r]
            [respa.handlers :as h]
            [respa.subs :as s]
            [respa.components :as c]
            [devtools.core :as devtools]))

(when ^boolean js/goog.DEBUG  
  (devtools/install! [:custom-formatters])
  (enable-console-print!)
  (println "debug mode ON"))


(defn render []
  (reagent/render [c/main] (.getElementById js/document "app")))

(defn ^:export main []
  (r/app-routes) 
  (dispatch-sync [:initialize-db])
  (render))
