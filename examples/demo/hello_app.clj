(ns demo.hello-app
  (:require [demo.application :as application]
            [demo.logger :as logger]))

(defrecord HelloApp [logger]
  application/Application
  (run [_]
    (logger/log! logger "Application started")))
