(ns demo.logger)

(defprotocol Logger
  (log! [logger message]))
