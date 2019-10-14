package edu.njit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    int result = activityNotifications(new int[] {2, 3, 4, 2, 3, 6, 8, 4, 5}, 5);
    }

	static int activityNotifications(int[] expenditure, int d) {
		int result = 0;
		int[] trailingIntegers = null;
		for(int i = d; i < expenditure.length ; i++) {
			if(trailingIntegers == null) {
				trailingIntegers = new int[d];
				trailingIntegers = Arrays.copyOfRange(expenditure, 0, d);
				Arrays.sort(trailingIntegers);
			} else {
				int index = 0;
				for(int k = 1; k < d; k++) {
					if(expenditure[i - 1] < trailingIntegers[k]) {
						trailingIntegers[index++] = expenditure[i - 1];
					} else {
						trailingIntegers[index++] = trailingIntegers[k];
					}
				}
			}
			int medianIndex = trailingIntegers.length / 2;
			float median = 0;
			if(trailingIntegers.length % 2 == 0) {
				median = (float)(trailingIntegers[medianIndex] + trailingIntegers[medianIndex - 1]) / 2;
			} else {
				median = trailingIntegers[medianIndex];
			}
			if(expenditure[i] >= (2 * median)) {
				result++;
			}
		}
		return result;
	}

}
