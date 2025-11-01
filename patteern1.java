/*
	Pattern 1:
	* * * * *
	* * * * *
	* * * * *
	* * * * *
	* * * * *

 */
// public class pattern1	{

// 		public static void main (String args [])	{
	
// 			for (int i =1; i <=5;i++)	{
		
// 				for (int j = 1; j <= 5; j++)	{
				
// 					System.out.print("* ");
// 			}
// 				System.out.println();
// 		}
// 	}
// }
/*
 pattern 2:
	1 1 1 1 1
	2 2 2 2 2
	3 3 3 3 3
	4 4 4 4 4
	5 5 5 5 5
 */
// public class pattern1{
	
// 		public static void main (String args [])	{
		
// 			for(int i = 1; i <=5; i++)	{
			
// 				for (int j = 1;j <= 5; j++)	{
		
// 					System.out.print(i +" ");
// 			}
// 				System.out.println();
// 		}
// 	}
// }
/*
 pattern 3:
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5		
	1 2 3 4 5
//  */
// public  class pattern1 	{
	
// 	public static void main (String args [] ){
	
// 		for(int i  = 1 ; i <=5 ; i++)	{
	
// 			for (int j = 1;  j <= 5; j++)	{
 
// 				System.out.print(j + " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }

/*
 pattern 4:
5 5 5 5 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1
 */
public class patteern1 {
	public static void main (String args []) {

		for (int i = 5; i>=1; i--){

			for (int j = 1; j<= 5 ; j++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}