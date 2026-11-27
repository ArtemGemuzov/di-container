(ns demo.console-logger
  (:require [demo.logger :as logger]))

(defrecord ConsoleLogger []
  logger/Logger
  (log! [_ message]
    (println message)))
