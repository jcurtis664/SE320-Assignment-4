import java.util.*;

public class linkedHashSets {
	public static void main(String args[])	{
		Set<String> set_one = new LinkedHashSet<String>();
		Set<String> set_two = new LinkedHashSet<String>();
		
		set_one.add("George");
		set_one.add("Jim");
		set_one.add("John");
		set_one.add("Blake");
		set_one.add("Kevin");
		set_one.add("Michael");
		
		set_two.add("George");
		set_two.add("Katie");
		set_two.add("Kevin");
		set_two.add("Michelle");
		set_two.add("Ryan");
		
		//FIND UNION OF TWO SETS
		Set<String> union = new LinkedHashSet<String>();
		
		union.addAll(set_one);
		union.addAll(set_two);
		
		System.out.println("UNION : " + union);
		System.out.println();
		
		//FIND DIFFERENCE OF TWO SETS
		Set<String> difference_one = new LinkedHashSet<String>();
		Set<String> difference_two = new LinkedHashSet<String>();
		
		difference_one.addAll(set_one);
		difference_one.removeAll(set_two);
		
		difference_two.addAll(set_two);
		difference_two.removeAll(set_one);
		
		System.out.println("DIFFERENCE BETWEEN SET_ONE AND SET_TWO: " + difference_one);
		System.out.println("DIFFERENCE BETWEEN SET_TWO AND SET_ONE: " + difference_two);
		System.out.println();
		
		//FIND INTERSECTION OF TWO SETS
		Set<String> intersection = new LinkedHashSet<String>();
		
		intersection.addAll(set_one);
		intersection.retainAll(set_two);
		
		System.out.println("INTERSECTION : " + intersection);
	}
}
