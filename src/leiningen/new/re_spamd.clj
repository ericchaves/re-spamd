(ns leiningen.new.re-spamd
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "re-spamd"))

(defn re-spamd
  "Create a new re-frame spa."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)
              :year (year)
              :author "Eric Chaves"}
        ]
    (main/info "Generating new re-frame spa.")
    (->files data
             [".gitignore" (render ".gitignore")]
             ["README.md" (render "README.md" data)]
             ["boot.properties" (render "boot.properties")]
             ["build.boot" (render "build.boot" data)]
             ["less/less.main.less" (render "less.main.less")]
             ["resources/images/welcome_card.jpg" (render "welcome_card.jpg")]
             ["resources/index.html" (render "index.html" data)]
             ["resources/js/core.cljs.edn" (render "core.cljs.edn" data)]
             ["src/cljs/{{sanitized}}/components.cljs" (render "components.cljs" data)]
             ["src/cljs/{{sanitized}}/core.cljs"       (render "core.cljs" data)]
             ["src/cljs/{{sanitized}}/db.cljs"         (render "db.cljs" data)]
             ["src/cljs/{{sanitized}}/handlers.cljs"   (render "handlers.cljs" data)]
             ["src/cljs/{{sanitized}}/routes.cljs"     (render "routes.cljs" data)]
             ["src/cljs/{{sanitized}}/subs.cljs"       (render "subs.cljs" data)]
             ["src/cljs/{{sanitized}}/ui.cljs"         (render "ui.cljs" data)]
             )))
