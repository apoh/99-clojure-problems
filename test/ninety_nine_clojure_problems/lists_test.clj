(ns ninety-nine-clojure-problems.lists-test
  (:require [clojure.test :refer :all]
            [ninety-nine-clojure-problems.lists :refer :all]))

(deftest my-last-test
  (testing "my last to get last element of list"
    (is (= (my-last [1 2 3 4]) 4))))

(deftest my-but-last-test
  (testing "my but last to get last element of list"
    (is (= (my-but-last [1 2 3 4]) [3 4]))))

(deftest element-at-test
  (testing "find n-th element in a list"
    (is (= (element-at [5 3 4 6], 3) 4))))

(deftest length-test
  (testing "count length of list"
    (is (= (length [5 3 4 6]) 4))))
