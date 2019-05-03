package com.practice.waste;

class FindGroups {
	// Returns count of all possible groups that can be formed from elements
	// of a[].

	int findgroups(int arr[], int n) {
		int c = 0;
		int j = 0;
		int s = 1;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			j = s;
			for (; j < arr.length; j++) {
				sum = (arr[i] + arr[j]) % 3;
				if (sum == 0) {
					c++;

				}
			}
			s++;
		}
		System.out.println(c);
		return c;
	}

	int findgroupsnew(int arr[], int n) {
		int c = 0;
		int j = 0;
		int s = 1;
		int t = 2;
		int y = 2;
		int k = 1;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			k = s;
			for (; k < n; k++) {
				j = t;
				for (; j < n; j++) {
					sum = (arr[i] + arr[k] + arr[j]) % 3;
					if (sum == 0) {
						c++;

					}
				}
				t++;
			}
			s++;
			y++;
			t = y;
		}
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		FindGroups groups = new FindGroups();
		int arr[] = { 3, 6, 7, 2, 9 };
		int n = arr.length;

		int s = groups.findgroupsnew(arr, n) + groups.findgroups(arr, n);
		System.out.println("Required number of groups are " + s);
	}
}
