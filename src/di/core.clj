(ns di.core)

(defn component [registration]
  (throw (UnsupportedOperationException. "component is not implemented")))

(defn registry [components]
  (throw (UnsupportedOperationException. "registry is not implemented")))

(defn create-container [registry]
  (throw (UnsupportedOperationException. "create-container is not implemented")))

(defn resolve-component [container protocol]
  (throw (UnsupportedOperationException. "resolve-component is not implemented")))
