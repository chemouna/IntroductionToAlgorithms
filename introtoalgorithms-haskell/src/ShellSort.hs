module ShellSort where

import Data.List (transpose, insert, unfoldr)

insertionSort :: Ord a => [a] -> [a]
insertionSort = foldr insert []

columnize :: Int -> [a] -> [[a]]
columnize k = transpose . takeWhile (not . null) . unfoldr (Just . splitAt k)

decolumnize :: [[a]] -> [a]
decolumnize = concat . transpose

shellSortPhase :: Ord a => Int -> [a] -> [a]
shellSortPhase k = decolumnize . map insertionSort . columnize k

shellSort :: Ord a => [a] -> [a]
shellSort xs = foldr shellSortPhase xs gaps
  where gaps = takeWhile (< (length xs)) gapsGenerator
        gapsGenerator = concat [[9 * 2^n - 9 * 2^(n `div` 2) + 1,
                                 8 * 2^(n+1) - 6 * 2^(n `div` 2) + 1] | n <- [0..]]


