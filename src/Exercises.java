
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

	 public String[] middle(String[] words) {
	 	String[] empty = new String[0];
	 		for(int i = 0; i < words.length; i ++) {
		 		boolean containsNull = false;
		 		containsNull = (words[i] == null) ? true : false;
		 		if(containsNull) {
			 		return empty;
		 		}
	 		}
	 		if(words == null) {
		 		return empty;
	 		} else if (words.length < 3 || words.length % 2 == 0) {
		 		return empty;
	 }
	 	String first = words[(int) Math.floor(words.length / 2) - 1];
	 	String middle = words[(int) Math.floor(words.length / 2)];
	 	String last = words[(int) Math.floor(words.length / 2) + 1];
	 	String[] returnArray = new String[3];
	 	returnArray[0] = first;
	 	returnArray[0] = middle;
	 	returnArray[0] = last;
	 	return returnArray;
 	}

  /*
	 * Exercise 6
 	 * Given an array of ints, numbers, return true if there exists three consecutively increasing numbers somewhere in the array.
 	 * The input array must meet the following speciications, otherwise you should return false.
 	 */

	 public boolean increasing(int numbers[] ) {
 		if(numbers == null) {
 			return false;
 		} else if (numbers.length < 1) {
 			return false;
 		}
 		for(int i = 0; i < numbers.length - 3; i++) {
 			double first = numbers[i];
 			double middle = numbers[i + 1];
 			double last = numbers[i + 2];
 			if(first > middle && middle > last) {
 				return true;
 			}
 		}
 		return false;
 	}

	/*
	 * Exercise 7
	 * Given an array of ints, values, and a target int, x, return true if x is everywhere in the array.
	 * A target is defined as being everywhere if it is located adjacent to every other element.
	 * The input array and target must meet the following specifications, otherwise you should return false. Use strict equality when making your comparisons.
	 */

	 public boolean everywhere(int values[], int x) {
 		if(values == null) {
 			return false;
 		} else if (values.length < 1) {
 			return false;
 		}
 		for(int i = 1; i < values.length - 1; i ++) {
 			if(values[i] != x) {
 				if(values [i - 1] != x) {
 					return false;
 				} else if(values [i + 1] != x) {
 					return false;
 				}
 			}
 		}
 		return true;
 	}

	 /*
 	  * Exercise 8
  	* Given an array of ints, numbers, return true if the array contains three consecutive even or three consecutive odd numbers.
  	* The input array must meet the following specifications, otherwise you should return false.
 	  */

		public boolean consecutive(int numbers[]) {
			if(numbers == null) {
				return false;
			} else if (numbers.length < 3) {
				return false;
			}
			for(int i = 0; i < numbers.length - 3; i ++) {
				if(numbers[i] % 2 == 0 && numbers[i + 1] % 2 == 0 && numbers[i + 2] % 2 == 0) {
					return true;
				}
				if(numbers[i] % 2 == 1 && numbers[i + 1] % 2 == 1 && numbers[i + 2] % 2 == 1) {
					return true;
				}
			}
			return false;
		}

	 /*
	  * Exercise 9
	 	* Given an array of ints, numbers, return true if it is possible to split the array so that the sum of the left half is equal to the sum of the right half.
	 	* The input array must meet the following specifications, otherwise you should return false.
		*/

		public boolean balance(int numbers[]) {
			if(numbers == null) {
				return false;
			} else if (numbers.length < 2) {
				return false;
			}
			for(int i = 0; i < numbers.length; i ++) {
				int sumLeft = 0;
				int sumRight = 0;
				for(int j = 0; j < i; i ++) {
					sumLeft += numbers[j];
				}
				for(int j = i; j < numbers.length; j ++) {
					sumRight += numbers[j];
				}
				if(sumLeft == sumRight) {
					return true;
				}
			}
			return false;
		}

		/*
 	  * Exercise 10
 	 	* Given an array of Strings, values, return the number of clumps in the array. A clump is defined as a consecutive series of two or more identical values.
 	 	* The input array must meet the following specifications, otherwise you should return -1. Use strict equality when making your comparisons.
 		*/

}
