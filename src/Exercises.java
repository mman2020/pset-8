
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
		int max = numbers[0];
		int mininum = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			max = (numbers[i] > max) ? numbers[i] : max;
			mininum = (numbers[i] < mininum) ? numbers[i] : mininum;
		}
		return max - mininum;
	}

  /*
	 * Exercise 4
	 * Given an array of doubles, numbers, return the largest value among the first, middle, and last elements in the array.
	 * The input array must meet the following specifications, otherwise you should return undefined.
	 */

	 public double biggest(double[] numbers) {
	 	if(numbers == null) {
		 	return 1/0;
	 	} else if (numbers.length < 3 || numbers.length % 2 == 0) {
		 	return 1/0;
	 	}
	 	double first = numbers[0];
	 	double middle = numbers[(int) Math.floor(numbers.length / 2)];
	 	double last = numbers[numbers.length - 1];
	 	double max = (first > middle && first > last) ? first :
	 	(middle > last) ? middle :
	 	last;
	 	return max;
 }

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

	/*
	 * Exercise 7
	 * Given an array of ints, values, and a target int, x, return true if x is everywhere in the array.
	 * A target is defined as being everywhere if it is located adjacent to every other element.
	 * The input array and target must meet the following specifications, otherwise you should return false. Use strict equality when making your comparisons.
	 */

	 /*
 	  * Exercise 8
  	* Given an array of ints, numbers, return true if the array contains three consecutive even or three consecutive odd numbers.
  	* The input array must meet the following specifications, otherwise you should return false.
 	  */

	 /*
	  * Exercise 9
	 	* Given an array of ints, numbers, return true if it is possible to split the array so that the sum of the left half is equal to the sum of the right half.
	 	* The input array must meet the following specifications, otherwise you should return false.
		*/

		/*
 	  * Exercise 10
 	 	* Given an array of Strings, values, return the number of clumps in the array. A clump is defined as a consecutive series of two or more identical values.
 	 	* The input array must meet the following specifications, otherwise you should return -1. Use strict equality when making your comparisons.
 		*/

}
