/*
    Pattern 11:
 1 1 1 2 1 3 
 2 1 2 2 2 3
 3 1 3 2 3 3
 4 1 4 2 4 3
 5 1 5 2 5 3
 */

//  public class pattern02 {
	
// 	public static void main (String args [])	{
		
// 		for(int i =1; i <= 5; i++)	{
			
// 			for (int j = 1; j <= 3; j++)	{
				
// 				System.out.print(i + " " + j +" " );
// 			}
// 			System.out.println();
// 		}
// 	}
// }

/*
    pattern 12:
    1 6 11 16 21
    2 7 12 17 22
    3 8 13 18 23
    4 9 14 19 24
    5 10 15 20 25
 */

 public class pattern02 {
		
	public static void main (String args [])	{
		
		int count;
		for(int i =1; i <= 5; i++)	{
            count = i;
			
			for(int j =1; j <= 5; j++)	{
				
				System.out.print(count + " ");
					count +=5; 
			}
				System.out.println();
		}
	}
}

