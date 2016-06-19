# re-spamd

A single page application using [re-frame](https://github.com/Day8/re-frame), [less](http://lesscss.org/) and [material design lite](http://getmdl.io).

**this template is a working in progress. use with care**
## Usage

to use this WIP you need to edit your `~/.lein/profiles.clj` and add it to the :plugins
```
{:user
 {:plugins [[re-spamd/lein-template "0.1.0-SNAPSHOT"]]}}
```
After that you can do
```
lein new re-spamd :my-cool-app
cd :my-cool-app
boot dev
```
## License

Copyright © 2016 Eric Chaves

Distributed under the [MIT license](https://mit-license.org/).
