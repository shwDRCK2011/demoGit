/*There's a loop from 0 to 800. in there, 
 * when the values is divider of 7, then print "Tic", 
 * if the value is divider of 9, then print "Tak" and 
 * if the value is divider of both 7 & 9, then print "TicTak"  
*/
public class QUestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<800; i++) {
			
			if(i % 7 == 0) {
			
				System.out.println("Tic" +i);
				
				if (i % 9 == 0) {
				
					System.out.println("TicTak" + i);
				} 
				
			} else if (i % 9 == 0) {
				
				System.out.println("Tak" +i);
			}
			
		}

	}

}
