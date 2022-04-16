package __Lecture;

public class Pattern8 {

	//   *
	//  **
	// ***
	//****
		
	public static void main(String[] args) 
	{
		
		int space=3;         //0
		int star =1;          //4
		
		//           2<=4
		for(int i=1; i<=4; i++)
		{    //          4<=3
			for(int j=1; j<=space; j++) 
			{
				System.out.print(" ");
			}
			   //       2<=1
			for(int j=1; j<=star; j++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
			space--;
			star++;			
		}

		
	}

}
