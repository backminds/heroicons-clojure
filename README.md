# heroicons-clojure

Converts the full [heroicons](https://heroicons.com) set for easy use from Clojure and ClojureScript as `.cljc` files.

Currently we include Hiccup (for Reagent et. al.) and Fulcro definitions.

## Coordinates

[![Clojars Project](https://img.shields.io/clojars/v/com.backminds/heroicons-clojure.svg)](https://clojars.org/com.backminds/heroicons-clojure)

```
com.backminds/heroicons-clojure {:mvn/version "0.4.2-3"}
```

## Usage

For `medium`/`outline` icons, the icon is available at

```clojure
;; Fulcro
com.backminds.heroicons-clojure.fulcro.outline.{icon-name}/{icon-name}

;; Reagent
com.backminds.heroicons-clojure.reagent.outline.{icon-name}/{icon-name}
```

For `small`/`solid` icons, the icon is available at

```clojure
;; Fulcro
com.backminds.heroicons-clojure.fulcro.solid.{icon-name}/{icon-name}

;; Reagent
com.backminds.heroicons-clojure.reagent.solid.{icon-name}/{icon-name}
```

## Example with wrapper
Using [Tailwind CSS](https://tailwindcss.com) classes.

For [Fulcro](https://github.com/fulcrologic/fulcro),

```clojure
(ns my-file
  (:require [com.backminds.heroicons-clojure.fulcro.outline.academic-cap :refer [academic-cap]]))

(dom/div {:classes ["h-5" "w-5"]}
  academic-cap)
```

For [Reagent](https://github.com/reagent-project/reagent),

```clojure
(ns my-file
  (:require [com.backminds.heroicons-clojure.reagent.outline.academic-cap :refer [academic-cap]]))

[:div {:class ["h-5" "w-5"]}
 academic-cap)
```

## Building

Clone [heroicons](https://github.com/tailwindlabs/heroicons) into `heroicons` and run `./build.clj`.

Requires [babashka](https://github.com/babashka/babashka).

## License

The heroicons set is offered under [its original license](https://github.com/tailwindlabs/heroicons).

For simplicity, `heroicons-clojure` uses the same license.

## About

Library by Henrik & Oskar at [Backminds](https://backminds.com). Icons by [Adam Wathan](https://github.com/adamwathan).
