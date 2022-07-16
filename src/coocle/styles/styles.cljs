(ns coocle.styles.styles)



(def logo-container
  {:height "15vh"
   :text-align "center"})

(def logo
  {:font-size "5vw"})

(def search-container
  {:height "6vh"
   :width "40vw"
   :border "3px solid #ccc"
   :border-radius "10vh"
   :margin "0 auto"})

(def search-form
  {:height "40%"
   :width "100%"
   :padding-left "10px"
   :display "flex"
   :flex-direction "row"
   :justify-content "space-evenly"})

(def search-input
  {:color "black"
   :font-size "20px"
   :font-family "sans-serif"
   :border "none"
   :padding-bottom "0.8vh"
   :margin "10px"
   :width "100%"
   :height "4vh"
   :background-color "transparent"
   :outline "none"})

(def search-button
  {:color "black"
   :font-size "2vh"
   :font-family "sans-serif"
   :border "none"
   :padding-bottom "0.8vh"
   :margin "10px"
   :width "20%"
   :height "3vh"
   :background-color "transparent"
   :cursor "pointer"})

(def search-results
  {:height "60vh"
   :width "100%"
   :overflow-y "scroll"})

(def search-result-nav
  {:list-style-type "none"
   :padding "0"
   :margin "0"})

(def search-result-item
  {:border-bottom "1px solid #ccc"
   :padding "10px"})

(def search-about-container
  {:max-width "100%"
   :margin "0 auto"
   :padding "0"
   :display "flex"
   :flex-direction "row"
   :justify-content "space-between"})

(def search-result-description
  {:font-size "2vh"
   :font-family "sans-serif"
   :margin "0 10px 0 0"
   :text-overflow "ellipsis"
   :overflow "hidden"
   :white-space "wrap"
   :max-height "15vh"})

(def search-result-site
  {:font-size "2vh"
   :font-family "sans-serif"
   :margin "0 10px 0 0"})
