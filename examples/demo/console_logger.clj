(ns demo.console-logger
  (:require [demo.logger :as logger]))

(defrecord ConsoleLogger []
  logger/ILogger
  (log! [_ message]
    (println message)))
