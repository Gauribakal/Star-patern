package Pattern6;

public class class4 {

	public static void main(String[] args) {
		
		int star=6;
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
	}
}
