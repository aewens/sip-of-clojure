(ns sip-of-clojure.core
    (:gen-class))
  
(def four (+ 2 2))
(def yes true)
(def no false)

(def res0 
    (if yes
        four
        no))

(defn -main
    "the origin of this lovely program"
    [& args]
    (if (= res0 four)
        (do (def res1 (str "2 + 2 is " four))
            (println res1))
        (when (not res0)
            (def res1 "Nope")
            (println res1))))
