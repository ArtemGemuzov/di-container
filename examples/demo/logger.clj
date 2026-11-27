(ns demo.logger)

(defprotocol ILogger
  (log! [logger message]))
