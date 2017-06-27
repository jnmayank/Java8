package com.java.MethodReference;

public class ComparisonProvider {
	public int compareByName(Person a, Person b) {   // can used as Instance method reference for the Comparator's compare method.
        return b.name.compareTo(a.name);
    }
}
