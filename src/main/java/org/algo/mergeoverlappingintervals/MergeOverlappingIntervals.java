package org.algo.mergeoverlappingintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
  public int[][] mergeOverlappingIntervals(int[][] intervals) {
    // Write your code here.
    return new int[][] {};
  }
 */
public class MergeOverlappingIntervals {


    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        final List<int[]> mergedIntervals = new ArrayList<>();
        var currentInterval = intervals[0];
        mergedIntervals.add(currentInterval);

        for (var nextInterval : intervals) {
            var currentIntervalEnd = currentInterval[1];
            var nextIntervalStart = nextInterval[0];
            var nextIntervalEnd = nextInterval[1];

            if (currentIntervalEnd >= nextIntervalStart) {
               currentInterval[1] = Math.max(currentIntervalEnd,nextIntervalEnd);
            } else {
                currentInterval = nextInterval;
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
