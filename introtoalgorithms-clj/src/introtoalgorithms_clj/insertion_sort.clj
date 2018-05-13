(ns introtoalgorithms-clj.insertion-sort)

(defn insertion-sort
  [coll]
  (reduce (fn [result input]
            (let [[less more] (split-with #(< % input) result)]
              (concat less [input] more)))
          []
          coll))

;(insertion-sort '(1 6 3 12 7 22 3))
