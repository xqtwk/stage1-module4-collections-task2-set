package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int key : sourceList) {
            int square = key * key;
            if (square >= lowerBound && square <= upperBound) {
                set.add(square);
            }
        }
        return set;
    }
}
