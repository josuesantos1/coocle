(ns coocle.styles.styles)



(def logo-container
  {:height "15vh"
   :text-align "center"})

(def logo
  {:font-size "15vh"})

(def search-container
  {:height "6vh"
   :width "100%"
   :border "3px solid #ccc"
   :border-radius "10vh"})

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
   :width "80%"
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
  {:height "40vh"
   :width "100%"})

(def search-result-nav
  {:list-style-type "none"
   :padding "0"
   :margin "0"})

(def search-result-item
  {:border-bottom "1px solid #ccc"
   :padding "10px"})



