package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> set = new HashSet<>();
        Set<String> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);

        for (String element : intersection) {
            if (!thirdSet.contains(element)) {
                set.add(element);
            }
        }

        for (String key : thirdSet) {
            if (!firstSet.contains(key) && !secondSet.contains(key)) set.add(key);
        }

        return set;
    }
}
