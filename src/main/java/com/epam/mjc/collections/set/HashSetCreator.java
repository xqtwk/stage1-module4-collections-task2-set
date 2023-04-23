package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer number : sourceList) {
            if (number == 0 || number % 2 == 0) {
                while (number % 2 == 0) {
                    set.add(number);
                    number /= 2;
                }
            }
            set.add(number);
            set.add(number * 2);
        }
        return set;
    }
}
