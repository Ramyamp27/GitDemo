package tutorialpoint;

public class StringMethods {
	public static void main(java.lang.String[] args) {
		String quote = "Focus on the good";
		// String quote1 = " ";
		String quote2 = "     Focus on the good     ";
		// String quote3 = "";
//length
		int len = quote.length();
		System.out.println("Length of the string is:" + len);
//equals
		boolean equals = quote.equals("focus on the good");
		System.out.println("Equals:" + equals);
//equalsIgnorecase
		boolean equalsIgnoreCase = quote.equalsIgnoreCase("focus on the good");
		System.out.println("EqualsIgnoreCase:" + equalsIgnoreCase);
//upper case
		String upperCase = quote.toUpperCase();
		System.out.println("Upper case:" + upperCase);
//lower case
		String lowerCase = quote.toLowerCase();
		System.out.println("Lower case:" + lowerCase);
//starts with
		boolean startsWith = quote.startsWith("Go");
		System.out.println("Starts with:" + startsWith);
//ends with
		boolean endsWith = quote.endsWith("od");
		System.out.println("Ends with:" + endsWith);
//contains
		boolean contains = quote.contains("j");
		System.out.println("Contains:" + contains);
//index of
		int indexOf = quote.indexOf("o");
		System.out.println("Indexof:" + indexOf);
//LastIndexOf
		int lastIndexOf = quote.lastIndexOf("o");
		System.out.println("Lastindexof:" + lastIndexOf);
//charAt
		char charAt = quote.charAt(10);
		System.out.println("Character at:" + charAt);
//replace
		String replace = quote.replace("good", "god");
		System.out.println("Replace:" + replace);

//substring
		String substring = quote.substring(2);
		System.out.println("Substring:" + substring);

		String substring1 = quote.substring(2, 10);
		System.out.println("Substring:" + substring1);
//isEmpty
		boolean empty = quote.isEmpty();
		/*
		 * boolean empty2 = quote1.isEmpty(); boolean empty3 = quote2.isEmpty(); boolean
		 * empty4 = quote3.isEmpty();
		 */
		System.out.println("Empty is:" + empty);
		/*
		 * System.out.println("Empty is:" + empty2); System.out.println("Empty is:" +
		 * empty3); System.out.println("Empty is:" + empty4);
		 */
//trim
		System.out.println("Trim:" + quote2);
		// String trim = quote.trim();
		String trim1 = quote2.trim();
		System.out.println("Trim:" + trim1);
		// System.out.println("Trim:" + trim1);
//split
		String[] split = quote.split("o");
		for (String string1 : split) {
			System.out.println("Split:" + string1);

		}

	}

}
