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

//  public class pattern02 {
		
// 	public static void main (String args [])	{
		
// 		int count;
// 		for(int i =1; i <= 5; i++)	{
//             count = i;
			
// 			for(int j =1; j <= 5; j++)	{
				
// 				System.out.print(count + " ");
// 					count +=5; 
// 			}
// 				System.out.println();
// 		}
// 	}
// }

/*
    pattern 13:
    1 10 11 20 21
    2 9 12 19 22
    3 8 13 18 23
    4 7 14 17 24
    5 6 15 16 25
 */
    
//   public class pattern02 {
        
//         public static void main (String args []){
            
//             int count1, count2;
//                 for(int i =1; i <=5; i++) {
                    
//                     count1 = i;
//                     count2 = 5 - i + 1;
//                     for(int j = 1; j <= 5; j++) {
                    
//                         if(j % 2 ==1) {
                        
//                             System.out.print(count1 + " ");
//                         } else {
                        
//                         System.out.print(count2   + " ");                
//                         }
//                     count1 +=5;
//                     count2 +=5;
//             }
//             System.out.println();

//         }
//     }
// }
/*
    pattern 14:
   5 10 15 20 25
   4 9 14 19 24
   3 8 13 18 23
   2 7 12 17 22
   1 6 11 16 21
 */
    
//  public class pattern02 {
	
// 	public static void main(String args [])	{
		
// 		int count;
// 			for(int i = 5; i >= 1; i--)	{
			
// 				count =i;
// 					for(int j = 5; j >= 1; j--)	{
						
// 						System.out.print(count + " ");
// 					count +=5;
// 			}
// 			System.out.println();
// 		}
// 	}
// }

/*
    pattern 15:
   5 6 15 16 25
   4 7 14 17 24
   3 8 13 18 23
   2 9 12 19 22
   1 10 11 20 21 
 */
// public class pattern02 {
	
// 	public static void main (String args [])	{
		
// 		int count1;
// 		int count2;
			
// 			for(int i =5; i >= 1; i--)	{
			
// 				count1 =i;
//                 count2 = 6 - i;
				
// 					for(int j =5; j >= 1; j--)	{
			
// 						if(j % 2 == 1)	{
					
// 							System.out.print(count1 +" ");
// 				} else {
				
// 							System.out.print(count2+ " ");	
// 				}
				
// 				count1 += 5;
// 				count2 += 5;
// 			}	
// 				System.out.println();
// 		}			
// 	}
// }

/*
    pattern 16:
    1 2 3 4 5 
    2 3 4 5 6
    3 4 5 6 7
    4 5 6 7 8
    5 6 7 8 9 
 */

// public class pattern02 {

// 	public static void main (String args [ ])	{
		
			
// 		for (int i = 1 ; i <=5; i++)	{
			
// 			for (int j = 1; j <= 5; j++)		{
				
// 				System.out.print((i+j-1) + " ");
// 			} 
// 			System.out.println(); 
// 		}
// 	}
// }

/*
    pattern 17:
    1 3 5 7 9
    3 5 7 9 11
    5 7 9 11 13
    7 9 11 13 15
    9 11 13 15 17
 */

 public  class pattern02 {
	
	public static void main (String args [ ])	{
		
		for(int i = 1; i <= 5; i++)		{
			
			for(int j = 1; j<= 5; j++)	{
				
                System.out.print((2*(i+j))-3 + " ");
			}
				System.out.println();
		}
	}
}
