
public class JavaBruchUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int OluAge = 39;
	String FirstName = "Wasiu";
	char SecondLeter = 'i';
	double decimalNumber = 4.676;
	boolean TrueOrFalse = false;
	
	
	//System.out.println(OluAge + " " + "is my current age");
	System.out.println();
	//ARRAYS
	
	int[] arrays = new int [5];
	arrays[0] = 567;
	arrays[1] = 43;
	arrays[2] = 577;
	arrays[3] = 0;
	arrays[4] = 22;
	
	int[] array1 = {34,0,45,948,1,34,55};
	
	//System.out.println(array1[5] + " " + arrays [0]);
	
	//looping in Arrays
	//For Loop
	//for (int i = 1; i<array1.length; i++) {
		//System.out.println(array1[i]);
	//}
	
	String[] myNames = {"Wasiu", "Olusola", "JINADU"};
	for (int i = 0; i<myNames.length; i++) {
		
		System.out.println(myNames[i]);
	}
	
	for (String names: myNames) {
		System.out.println(names);
	}
	
	

	}

}
