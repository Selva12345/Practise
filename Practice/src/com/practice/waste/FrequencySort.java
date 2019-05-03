package com.practice.waste;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 2, 3, 4,5,12, 2, 3, 3, 3, 12 };
		sortByFrequency(a, a.length);
	}

	private static void sortByFrequency(int[] a, int n) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(a[i])) {
				int count = map.get(a[i]) + 1;
				map.put(a[i], count);
			} else {
				map.put(a[i], 1);
			}
		}

		ValueComparator<Integer, Integer> vc = new ValueComparator(map);
		Map<Integer, Integer> tree = new TreeMap<Integer, Integer>(vc);
		tree.putAll(map);

		for (Map.Entry<Integer, Integer> entry : tree.entrySet()) {
			for (int j = entry.getValue(); j > 0; j--) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}

	static class ValueComparator<T1, T2 extends Comparable<T2>> implements Comparator<T1> {
		Map<T1, T2> base;
		T2 value1, value2;

		public ValueComparator(Map<T1, T2> base) {
			this.base = base;
		}

		@Override
		public int compare(T1 arg0, T1 arg1) {
			// TODO Auto-generated method stub
			value1 = base.get(arg0);
			value2 = base.get(arg1);
			return value2.compareTo(value1);
		}
	}

}
