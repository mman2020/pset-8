
public class Exercises {
	/*
	 * Exercise 1
	 * Given two arrays of ints, a and b, return true if the arrays have either the same first element or the same last element.
	 * The arrays must meed the following specifications, otherwise you should return false.
   */
	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		} else if(a.length < 1 || b.length < 1) {
			return false;
		} else if(a[0] == b[0]) {
			return true;
		} else if(a[a.length - 1] == b[b.length - 1]) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Exercise 2
	 * Given an array of Strings, values, return a new array comprised of the first and last n elements of the original array.
	 * The input array must meet the following specifications, otherwise you should return an empty array.
	 */

	public String[] endsMeet(String[] values, int n) {
		String[] empty = new String[0];
		if(values == null) {
			return empty;
		} else if(values.length < n) {
			return empty;
		} else if(n < 0) {
			return empty;
		}
		String[] a = new String[(2 * n)];
		for(int i = 0; i < n; i ++) {
			a[i] = values[i];
			a[a.length - i] = values[values.length - i];
		}
		return a;
	}

	/*
   * Exercise 3
   * Given an array of ints, numbers, return the difference between the largest and smallest values.
	 * The input array must meet the following specifications, otherwise you should return undefined.
   */

	public int difference(int[] numbers) {
		if(numbers == null) {
			return 1/0;
		} else if(numbers.length < 1) {
			return 1/0;
		}
		int maximum = numbers[0];
		int mininum = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			maximum = (numbers[i] > maximum) ? numbers[i] : maximum;
			mininum = (numbers[i] < mininum) ? numbers[i] : mininum;
		}
		return maximum - mininum;
	}
  /*
	 * Exercise 4
	 * Given an array of doubles, numbers, return the largest value among the first, middle, and last elements in the array.
	 * The input array must meet the following specifications, otherwise you should return undefined.
	 */

  /*
	 * Exercise 5
 	 * Given an array of Strings, words, return a new array comprised of the middle three elements of the original array.
 	 * The input array must meet the following specifications, otherwise you should return an empty array.
	 */

  /*
	 * Exercise 6
 	 * Given an array of ints, numbers, return true if there exists three consecutively increasing numbers somewhere in the array.
 	 * The input array must meet the following speciications, otherwise you should return false.
 	 */
}
