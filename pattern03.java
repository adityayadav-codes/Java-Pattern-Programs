/*
    patter 21:
    0 1 0 1 0
    0 0 0 0 0 
    0 1 0 1 0
    0 0 0 0 0 
    0 1 0 1 0
 */
// public class pattern03 {
		
// 	public static void main(String [ ] args)	{
			
// 		for( int i =1; i <= 5; i++) 	{
			
// 			for(int j =0; j < 5; j++)	{
		
// 				System.out.print(((i*j) % 2) + " " );
// 			}
// 				System.out.println();
// 		}
// 	}
// }

/*
    pattern 22:
    0 0 0 0 0
    1 1 1 1 1 
    0 0 0 0 0
    1 1 1 1 1
    0 0 0 0 0                   
 */

//  public class pattern03 {
	
// 	public static void main (String args [ ]) {
		
// 		for(int I = 0; I < 5 ; I++) {
			
// 			for(int j =1; j <= 5; j++) {
		
// 				System.out.print((I % 2) + " "); 

// 				}
// 				System.out.println();
// 			}
// 		}
// 	}

/*
    pattern 23:
    1 1 1 1 1 
    0 0 0 0 0 
    1 1 1 1 1 
    0 0 0 0 0 
    1 1 1 1 1 
 */
    
//  public class pattern03 {
	
// 	public static void main(String args [ ]) {
			
// 		for(int I = 1; I <= 5; I++)	 {
			
// 			for(int j = 1; j <= 5; j++) {
			
// 				System.out.print((I% 2) + " ");
// 			}
// 				System.out.println();
// 		}
// 	}
// }

/*
    pattern 24:
    0 1 0 1 0
    0 1 0 1 0 
    0 1 0 1 0 
    0 1 0 1 0 
    0 1 0 1 0 
 */
    // public class pattern03 {
    
    //     public static void main(String[] args) {
            
    //         for(int i =1; i <= 5; i++) {

    //             for(int j = 0; j < 5; j++) {

    //                 System.out.print(((j) % 2) + " ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }
    
/*
    pattern 25:
    1 0 1 0 1 
    1 0 1 0 1  
    1 0 1 0 1 
    1 0 1 0 1
    1 0 1 0 1
 */

// public class pattern03 {

//     public static void main(String[] args) {
        
//         for(int i =1; i <= 5; i++) {
            
//             for(int j = 1; j <= 5; j++){

//                 System.out.print(j%2 + " ");
//             }
//             System.out.println();
//         }       
//     }
// }

/*
    pattern 26:
    A A A A A
    B B B B B 
    C C C C C
    D D D D D
    E E E E E
 */
    // public class pattern03 {
    
    //     public static void main(String[] args) {
            
    //         char r ; 
    //         char q ;

    //             for(r= 'A'; r<= 'E'; r++) {

    //                for(q='A'; q <= 'E'; q++) {

    //                     System.out.print(r + " ");
    //                }
    //                System.out.println();
    //             }
    //     }
    // }

/*
    pattern 27:
    A B C D E
    A B C D E
    A B C D E
    A B C D E
    A B C D E
 */

// public class pattern03 {

//     public static void main(String[] args) {
        
//         char i ;
//         char j;
//             for(i = 'A'; i <= 'E'; i++) {

//                 for(j = 'A'; j <= 'E'; j++) {

//                     System.out.print(j + " ");
//                 }
//                 System.out.println();
//             }
//     }
//}
/*
    pattern 28:
    E E E E E
    D D D D D
    C C C C C
    B B B B B 
    A A A A A
 */
// public class pattern03 {

//     public static void main(String[] args) {
        
//         char i;
//         char j;
//             for(i = 'E'; i >= 'A'; i--){
                
//                 for(j = 'E'; j >= 'A'; j--) {

//                     System.out.print(i  + " ");
//                 }
//                 System.out.println();
//             }
//     }
// }

/*
    pattern 29:
    E D C B A
    E D C B A
    E D C B A
    E D C B A
    E D C B A 
 */
// public class pattern03 {
//     public static void main(String args []){
        
//             char i;
//             char j;
//                 for(i = 'E'; i >='A'; i--) {

//                     for(j = 'E'; j >='A';j--) {

//                         System.out.print(j + " ");
//                     }
//                     System.out.println();
//                 }
//     }
// }
 
/*
    pattern 30:
    A B C D E 
    F G H I J 
    K L M N O 
    P Q R S T 
    U V W X Y
 */public class pattern03 {

    public static void main(String[] args) {
        
        char ch = 'A';
            for(int i = 1; i <= 5; i++) {

                for(int j = 1; j <= 5; j++) {

                    System.out.print(ch + " ");
                        if(ch < 'Z') {
                            ch++;
                        } else {
                            ch = (char)'A';
                        }
                }
                System.out.println();
            }
    }
 }
