package languageBasicsOfJaveProgLanguage;
//Arrays
		// 1. The data type we are going to use to store multiple values with same data
		// type
		// 2. Arrays are fixed in length
		// 3. While initiating the array itself it is going to consume the memory

		// Syntax of Array ==> DataType [] Variable = new DataType [length];
		// to store values in array we will use index ==> index starts with zero (0) ==>
		// Variable[Index]
		// Maximum Index allowed is length - 1;


public class ArraysConcepts {

	public static void main(String[] args) {
	//To Store the variable
		String [] arrayNames = new String[3] ;
		
		
		//Array of Arrays==2D
		
		String [] [] totalEmp = new String [2][3]; // Total array allocation 1st total group and 2nd one each group total employee
		
		totalEmp [0][0]="A";
		totalEmp [0][1]="B";
		totalEmp [0][2]="C";
		
		totalEmp [1][0]="A1";
		totalEmp [1][1]="B1";
		totalEmp [1][2]="C1";
		
		// Array Disadvantage
		//1. Fixed in Length
				//2. Similar Data Types only allowed
				//3. memory allocation will happen while initiating the array itself (Static)
				//4. Modifications are not allowed 
				
		
		

	}

}
