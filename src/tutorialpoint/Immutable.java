package tutorialpoint;

public class Immutable {

	public static void main(String[] args) {
		
		//Immutable
		//duplicate- shared memory
String a= "Europe";
System.out.println(System.identityHashCode(a));

String b="Europe";
System.out.println(System.identityHashCode(b));

String c="Turkey";
System.out.println(System.identityHashCode(c));

// concordination - new memory
String d=a+b;
System.out.println(System.identityHashCode(d));
		
//Mutable
		StringBuffer a1=new StringBuffer("Canada");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(System.identityHashCode(a1));
		
		StringBuffer b1=new StringBuffer("Canada");
		System.out.println(System.identityHashCode(b1));
		
		System.out.println(System.identityHashCode(b1.append(a1)));		
	}

}
