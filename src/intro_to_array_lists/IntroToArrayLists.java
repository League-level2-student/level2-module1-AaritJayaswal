package intro_to_array_lists;
import java.util.ArrayList;
public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		String[] strings = new String[] {"Bob","Joe","Jeff","John","Billy"};
		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
		
		for(int i = 0; i<5;i++) {
		
		System.out.println(strings[i]);
		
		}
		//4. Print all the Strings using a for-each loop
		for(String string : strings) {
			
			System.out.println(strings);
			
		}
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
