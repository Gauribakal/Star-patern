package __Lecture;

public class Pattern3 {

	//****
	//****
	//****
		
	public static void main(String[] args) 
	{
		//          4<=3    4
		for(int i=1; i<=3; i++)   //outer for loop --> rows
		{       //     
			for(int j=1; j<=4; j++)    //inner for loop  --> cols
			{
				System.out.print("*");
			}
			System.out.println();
		}		
	}

}
