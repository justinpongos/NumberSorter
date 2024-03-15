
public class WeirdSorterDriver {
	public static void main(String[]args) {
		OrderedNums one = new OrderedNums();
		
		WeirdSorter two = new WeirdSorter(one.getList());
		System.out.println(one);
		two.EvenOddNumbers();
		System.out.println(two);
		
	}//end main
}//end class
