(ns coocle.pages.search)

(def items [{:title "Item 1"
             :url "http://www.google.com"}
            {:title "Item 2"
             :url "http://www.yahoo.com"}
            {:title "Item 3"
             :url "http://www.bing.com"}
            {:title "Item 4" 
             :url "http://www.duckduckgo.com"}])

(defn searh-page
  []
  [:div
   [:div
    [:h1 "CLOOCLE"]]
   [:div {:class "search-div"}
    [:form {:class "search-form"}
     [:input {:class "search-input" :type "text"}]
     [:button {:class "search-button"} "Search"]]]
   [:div {:class "search-results"}
    [:ul
     (for [item items]
       [:li
        [:div {:class "search-result"}
         [:div {:class "search-result-title"}
          [:a {:href (:url item)}
           [:span {:class "search-result-title-text"} (:title item)]]
          [:div {:class "search-result-description"}
           [:span {:class "search-result-description-text"}]]]]])]]])
