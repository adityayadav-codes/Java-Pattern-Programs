/*
    pattern 31:
    A B C D E 
    B C D E F
    C D E F G
    D E F G H 
    E F G H i
 */

//  public class pattern04 {
	
// 	public static void main(String args [ ]) {
		
// 		for(int i = 0; i < 5; i++) {
			
// 			for(int j = 0; j < 5; j++) {
				
// 				System.out.print(((char)(i + j + 65 ) + " "));
// 			}
// 				System.out.println();
// 		}
// 	}
//}
/*
    pattern 32:
    A F K P U 
    B G L Q V
    C H M R W
    D I N S X
    E J 0 T Y
 */
    // public class pattern04 {

    //     public static void main(String args []) {

    //         int x;
    //         for(int i = 0; i < 5; i++) {

    //             x = i;
    //             for(int j =1; j <= 5;j++) {
    //                 x+=5;
    //                 System.out.print((char)(x - 5 + 65) + " ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }

/*
    pattern 33:
    E J O T Y
    D I N S X
    C H M R W
    B G L Q V
    A F K P U
// //  */
// public class pattern04 {

//     public static void main(String args []) {
//         int x;
//         for(int i =1; i <= 5; i++) {
//             x = 5-i;
//             for(int j =1;j <=5;j++) {
//             System.out.print((char)(x + 65)+" ");
//             x+=5;
//             }
//              System.out.println();
//         }
       
//     }
// }
/*
    pattern 34:
    * 
    * *
    * * *
    * * * * 
    * * * * * 
//  */
//     public class pattern04 {
    
//        public static void main(String[] args) {
        
//             for(int i = 1; i <= 5; i++) {

//                 for(int j =1; j <= i; j++) {
                    
//                     System.out.print("*"+" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }

    
    /* pattern 35:
        1 
        2 2 
        3 3 3 
        4 4 4 4
        5 5 5 5 5
     */

     public class pattern04 {
     
        public static void main(String[] args) {
            
            for(int i =1; i <= 5; i++) {

                for(int j =1; j <= i; j++){

                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
     }