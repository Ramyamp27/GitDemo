package tutorialpoint;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSet {

	public static void main(String[] args) {

		Set<Object> s = new LinkedHashSet<>();
		
	/*	s.add("Lion");
		s.add("Tiger");
		s.add("zebra");
		s.add("rabbit");
		s.add("camel");
		s.add("cat");
		s.add("rabbit");
		s.add("fox");
		s.add("Lion");
		s.add("bull");*/
	
		s.add("Lion");
		s.add("Tiger");
		s.add("zebra");
		s.add("rabbit");
		s.add(2);
		s.add(null);
		s.add(27);
		s.add(null);
		s.add("Lion");
		s.add(8);

		System.out.println(s);

		int size = s.size();
		System.out.println(size);

		// no get // no set //no indexOf

		boolean contains = s.contains("horse");
		System.out.println(contains);

		Set<Integer> s1 = new LinkedHashSet<>();
		s1.add(50);
		s1.add(60);
		s1.add(27);
		s1.add(30);
		s1.add(80);
		s1.add(8);
		s1.add(90);

		System.out.println(s1);

//		s.addAll(s1);
		// System.out.println("addAll:" + s);

		// s.retainAll(s1);
		// System.out.println("retainAll:" +s);

		// s.removeAll(s1);
		// System.out.println("remove all:" + s);

		s1.remove(2);
		System.out.println("remove:" + s1);

		s1.clear();
		System.out.println("clear:" + s1);

	}

}