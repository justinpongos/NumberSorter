
public class WeirdSorter {
	private int[] arr;
	private int[] arr0;

	public WeirdSorter () {
		OrderedNums nums = new OrderedNums();
		this.arr = nums.getList();
	}//end zero argument
	
	public int[] Sort(int[]arr) {
		
		//perfect squares
		for (int index = 0; index < arr.length; index++ ) {
		int a = 0;	
			double a0 = Math.sqrt(arr[index]);
			a += Math.round(a0);
		
		if (a * a == arr[index]) {
			System.out.println(arr[index]);
			}//end if
		}//end for 
		
		System.out.println(0 + "\n");
		
		//prime numbers
		for (int index = 0; index < arr.length; index++) {
		int b = 2;
		int c = 1;
		while (b < arr[index]) {
			if (arr[index] % b == 0) {
				c =0;
				break;
			}//end if
			b++;
		}//end while
		
		if (c == 1 ) {
			System.out.println(arr[index]);
			}//end if
		}//end for
		
		System.out.println(0 + "\n");
		
		//does not fit other categories
		for (int index = 0; index < arr.length; index++) {
			int a = 0;
			int b = 2;
			int c = 1;
			int arrHolder = 0;
			arrHolder += arr[index]; 
			int sum = 0;
			
			double a0 = Math.sqrt(arr[index]);
			a += Math.round(a0);
		
		while (b < arr[index]) {
			if (arr[index] % b == 0) {
				c = 0;
				break;
				}//end if
				b++;
			}//end while
			
		while (arrHolder > 0) {
			sum = sum + arrHolder % 10;
			arrHolder = arrHolder /10;
		}//end while
			if (a * a != arr[index] && sum % 6 != 0 && c == 1) {
			}//end if
		}//end for
		
		System.out.println(0 + "\n");
		
		//multiples of 6 and not prime numbers
		
		for (int index = 0; index < arr.length; index++) {
			int b = 2;
			int c = 1;
			int arrHolder = 0;
			arrHolder += arr[index];
			int sum = 0;
			
			while (b < arr[index]) {
				if (arr[index] % b ==0) {
					c = 0;
					break;
				}//end if 
				b++;
			}//end while
			
			while (arrHolder > 0) {
				sum = sum + arrHolder % 10;
				arrHolder = arrHolder / 10;
			}// end while
				if (c == 0 && sum % 6 == 0) {
					System.out.println(arr[index]);
				}//end if
				return arr[index];
			}//end for
	}//end sorter
	
	
	public String toString() {
		String output;
		output = "The List is organized in this order, with there being zeros in between each" + "\n" + "1: Perfect squares | 2: Prime numbers | 3: Numbers that don't fit all other categories | 4: Numbers who's digits are multiples of 6 and aren't prime |" + "\n" + "\n";
		return output;
	}//end toString
}//end class

