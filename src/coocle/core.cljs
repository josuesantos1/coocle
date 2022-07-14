(ns coocle.core
    (:require
      [reagent.core :as r]
      [reagent.dom :as d]
     
      [coocle.pages.search :as search]))

;; -------------------------
;; Views

(defn home-page []
  [:div [:h2 "Welcome to Reagent"]])

;; -------------------------
;; Initialize app

(defn mount-root []
  (d/render [search/searh-page] (.getElementById js/document "app")))

(defn ^:export init! []
  (mount-root))
