package day62;

import day61.Job;

import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {
    public static void main(String[] args) {
        //Create a SortedSet of Job (from day 61) with TreeSet implementation
        SortedSet<Job> sortedJobSet = new TreeSet<>();

        sortedJobSet.add(new Job("FL", 120000, "AT&T"));
        sortedJobSet.add(new Job("LA", 160000, "BBC"));
        sortedJobSet.add(new Job("TX", 150000, "Apple"));
        for (Job each : sortedJobSet) {
            System.out.println("each = " + each);
        }

    }
}
