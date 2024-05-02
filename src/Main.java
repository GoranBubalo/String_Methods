
public class Main {

	public static void main(String[] args) {
	
		//String == > a reference data types that can store one or more characters 
		// 			  reference data types have access to useful methods 
		
		
		String name = "Bro"; 
		
		
		//equals method 
		//Case sensitive 
		boolean result_0 = name.equals("bro");
		System.out.println(result_0);
		System.out.println();
		//.equalsIgnoreCase
		boolean result_1 = name.equalsIgnoreCase("bro");
		System.out.println(result_1);
		System.out.println();
		//.length
		int result_2 = name.length();
		System.out.println(result_2);
		System.out.println();
		//.charAt
		char result_3 = name.charAt(0);
		System.out.println(result_3);
		System.out.println();
		//.indexOf
		int result_4 = name.indexOf("o");
		System.out.println(result_4);
		System.out.println();
		//.isEmpty
		boolean result_5 = name.isEmpty();
		System.out.println(result_5);
		System.out.println();
		// .toUpperCase()
		String result_6 = name.toUpperCase();
		System.out.println(result_6);
		System.out.println();
		
		//.toLowerCase()
		String result_7 = name.toLowerCase();
		System.out.println(result_7);
		System.out.println();
		
		//.trim()
		String result_8 = name.trim();
		System.out.println(result_8);
		
		//.replace( , );
		String result_9 = name.replace('o', 'a');
		System.out.println(result_9);

	}

}
