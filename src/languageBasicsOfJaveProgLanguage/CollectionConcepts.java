package languageBasicsOfJaveProgLanguage;

import java.util.ArrayList;
import java.util.List;

public class CollectionConcepts {

	public static void main(String[] args) {
		// Array Disadvantage
				//1. Fixed in Length
						//2. Similar Data Types only allowed
						//3. memory allocation will happen while initiating the array itself (Static)
						//4. Modifications are not allowed 
						
		// Collections

				// 1. List ==> ArrayList and LinkedList

//				==> List Can Store multiple values with Same data type
//				==> List will allocate memory dynamically to store values (Only when it's required)
//				==> No need to specify size (like length in Array)
//				==> Modifications Allowed
//				==> LIST CAN STORE DUPLICATE VALUES
		
		
		// 2. Set ==> HashSet , LinkedHashSet and TreeSet
		
		//==> Set Can Store multiple values with Same data type
//				==> Set will allocate memory dynamically to store values (Only when it's required)
//				==> No need to specify size (like length in Array)
//				==> Modifications Allowed
//				==> SET CANNOT STORE DUPLICATE VALUES

		/********* ArrayList ConCepts***********/
		System.out.println("========ArrayList========");
		// Order of Storing the Values ==> Insertion Order
		// Storing null values ==> Can store null values

		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Rohan");
		empNamesArrayList.add("Ashwin");
		empNamesArrayList.add("Amit");
		empNamesArrayList.add("Anannya");
		empNamesArrayList.add(null); // null meaning no value (literal) ==> getting memory from computer but not
										// storing any value
//		empNamesArrayList.remove("Amit");

		System.out.println(empNamesArrayList);

	}

}
