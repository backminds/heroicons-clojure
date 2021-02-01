(ns com.backminds.heroicons-clojure.fulcro.outline.shopping-bag
  (:refer-clojure :exclude [shopping-bag]))

(def shopping-bag (com.fulcrologic.fulcro.dom/svg {:xmlns "http://www.w3.org/2000/svg", :fill "none", :viewBox "0 0 24 24", :stroke "currentColor"} (com.fulcrologic.fulcro.dom/path {:strokeLinecap "round", :strokeLinejoin "round", :strokeWidth "2", :d "M16 11V7a4 4 0 00-8 0v4M5 9h14l1 12H4L5 9z"})))

(def shopping-bag-icon shopping-bag)