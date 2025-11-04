/*
    pattern 31:
    A B C D E 
    B C D E F
    C D E F G
    D E F G H 
    E F G H i
 */

 public class pattern04 {
	
	public static void main(String args [ ]) {
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				System.out.print(((char)(i + j + 65 ) + " "));
			}
				System.out.println();
		}
	}
}