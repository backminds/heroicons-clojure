(ns com.backminds.heroicons-clojure.fulcro.outline.backspace
  (:refer-clojure :exclude [backspace]))

(def backspace (com.fulcrologic.fulcro.dom/svg {:xmlns "http://www.w3.org/2000/svg", :fill "none", :viewBox "0 0 24 24", :stroke "currentColor"} (com.fulcrologic.fulcro.dom/path {:strokeLinecap "round", :strokeLinejoin "round", :strokeWidth "2", :d "M12 14l2-2m0 0l2-2m-2 2l-2-2m2 2l2 2M3 12l6.414 6.414a2 2 0 001.414.586H19a2 2 0 002-2V7a2 2 0 00-2-2h-8.172a2 2 0 00-1.414.586L3 12z"})))

(def backspace-icon backspace)