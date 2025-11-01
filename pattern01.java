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
// public class patteern1 {
// 	public static void main (String args []) {

// 		for (int i = 5; i>=1; i--){

// 			for (int j = 1; j<= 5 ; j++) {

// 				System.out.print(i + " ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }

/*
 pattern 5:
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
 */

//  public class pattern01 {
	
// 	public static void main(String args[])		{
		
// 		for (int i = 5; i >=1; i--)	{
			
// 			for(int j = 5; j >=1; j--)	{
				
// 				System.out.print(j + " ");
// 			}
// 			System.out.println();
// 		}
//  	}
// }

/*
 pattern 6:
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/

//  public class pattern01 {
	
// 	public static void main(String args[])		{
		
// 		int count = 1;
// 		for (int i = 1; i <=5; i++)	{
			
// 			for(int j = 1; j <=5; j++)	{
				
// 				System.out.print(count + " ");
// 				count++;
// 			}
// 			System.out.println();
// 		}
//   	}
// }

/*
 pattern 7:
1 3 5 7 9
2 4 6 8 10
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49
*/
// public class pattern01 {
// 	public static void main(String args [])	{
		
// 		int count =1;
		
// 		for(int i =1; i<=5; i++)	{
		
// 			for(int j = 1; j <=5; j++)	{
			
// 				System.out.print(count + " ");
// 				count +=2;
// 			}
// 			System.out.println();
// 		}
// 	}
// }

/*
 pattern 8:
 2 4 6 8 10
 12 14 16 18 20
 22 24 26 28 30
 32 34 36 38 40
 42 44 46 48 50
*/

// public class pattern01 {	
	
// 	public static void main (String args [] )	{
		
// 		int count =2;
// 			for (int i = 1; i <=5; i++)	{
		
// 				for(int j = 1; j <=5;j++)	{
				
// 					System.out.print(count + " ");
// 					count +=2;
// 			}
// 				System.out.println();
// 		}			
// 	}
// }

/*
 pattern 9:
 1 2 3 4 5
 2 4 6 8 10
 3 6 9 12 15
 4 8 12 16 20
 5 10 15 20 25
 */
 
 public class pattern01	{
	
	public static void main(String args [])	{
		
		for (int I =1; I <=5; I++)	{
			
			for(int j =1; j <=5; j++)	{
		
					System.out.print(I * j + " ");
			}
				System.out.println();
		}
	}
}