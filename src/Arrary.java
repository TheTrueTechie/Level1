public class Arrary {
	public static void main(String[] args) throws Exception {

        // 1. Declare array of Strings 
	//int A = 6;	  
String[] List;
// 2. Allocates memory for 5 student names 
List = new String[6];
//3. Assign first element of array to your name.
List[2] = "Jack is 11 Years Old";
// 5. Assign the next few elements to the names of the rest of your class
List[4] = "Toby is 12 Years Old";
List[5] = "Andrew is 26 Years Old";
List[1] = "Kanvar is 10 Years Old";
List[3] = "Shiva is 12 Years Old";
           

       

        // 6. Set up a loop to print every name
for (int I = 1; I < 6; I++) {
	System.out.println(List[I]);
}
               // 4. Print name 
       // System.out.println(List);
	}
}


