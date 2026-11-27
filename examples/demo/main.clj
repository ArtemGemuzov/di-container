(ns demo.main
  (:require [demo.application :as application]
            [demo.console-logger]
            [demo.hello-app]
            [demo.logger :as logger]
            [di.core :as di])
  (:import [demo.console_logger ConsoleLogger]
           [demo.hello_app HelloApp]))

(defn -main [& _]
  (let [registry (di/registry
                  [(di/component {:type ConsoleLogger
                                  :provides logger/Logger})
                   (di/component {:type HelloApp
                                  :provides application/Application
                                  :inject {:logger logger/Logger}})])
        container (di/create-container registry)
        app (di/resolve-component container application/Application)]
    (application/run app)))
