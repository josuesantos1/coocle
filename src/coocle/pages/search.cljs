(ns coocle.pages.search
  (:require [coocle.styles.styles :as styles]))

(def items [{:title "Item 1"
             :url "http://www.google.com"
             :description "This is a description"
             :site-name "Google"}
            {:title "Item 2"
             :url "http://www.yahoo.com"
             :description "This is a description"
             :site-name "Yahoo"}
            {:title "Item 3"
             :url "http://www.bing.com"
             :description "This is a description"
             :site-name "Bing"}
            {:title "Item 4"
             :url "http://www.duckduckgo.com"
             :description "This is a description"
             :site-name "DuckDuckGo"}
            {:title "Item 5"
             :url "http://www.ask.com"
             :description "This is a description"
             :site-name "Ask"}
            {:title "item 6"
             :url "http://www.baidu.com"
             :description "This is a description"
             :site-name "Baidu"}
            {:title "Item 1"
             :url "http://www.google.com"
             :description "This is a description"
             :site-name "Google"}
            {:title "Item 2"
             :url "http://www.yahoo.com"
             :description "This is a description"
             :site-name "Yahoo"}
            {:title "Item 3"
             :url "http://www.bing.com"
             :description "This is a description aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
             :site-name "Bing"}
            {:title "Item 4"
             :url "http://www.duckduckgo.com"
             :description "This is a description aaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaa aaaaaaaaaaa aaaaaaaaaa aaaaaaaaaaaaaa aaaaaaaa aaaaaaaaaa
                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaa aaaaaaaaaaa aaaaaaaaaa aaaaaaaaaaaaaa aaaaaaaa aaaaaaaaaa
                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaa aaaaaaaaaaa aaaaaaaaaa aaaaaaaaaaaaaa aaaaaaaa aaaaaaaaaa
                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaa aaaaaaaaaaa aaaaaaaaaa aaaaaaaaaaaaaa aaaaaaaa aaaaaaaaaa"
             :site-name "DuckDuckGo"} 
            {:title "Item 5"
             :url "http://www.ask.com"
             :description "This is a description"
             :site-name "Ask"}
            {:title "item 6"
             :url "http://www.baidu.com"
             :description "This is a description"
             :site-name "Baidu"}]) 

(defn searh-page
  []
  [:div 
   [:div {:style styles/logo-container}
    [:h1 {:style styles/logo} "COOCLE"]]
   [:div {:style styles/search-container}
    [:form {:style styles/search-form}
     [:input {:style styles/search-input :type "text"}]
     [:button {:style styles/search-button} "Search"]]]
   [:div {:style styles/search-results}
    [:ul {:style styles/search-result-nav}
     (for [item items]
       [:li
        [:div {:style styles/search-result-item}
         [:div
          [:a {:href (:url item)}
           [:span (:title item)]]
          [:div {:style styles/search-about-container}
           [:span {:style styles/search-result-description} 
            [:p (:description item)]]
           [:span {:style styles/search-result-site} 
            [:p (:site-name item)]]]]]])]]])
