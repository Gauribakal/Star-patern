package Pattern7;

public class class2 {

	public static void main(String[] args) {
		
		int star=10;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star-2;
		}
	}
}
