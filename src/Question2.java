/*Using recursion, print 1 to 10 in reverse order*/

public class Question2 {

	public static void recursion(int n) {
		if( n > 0 ) {
	       
	        System.out.println(n);
	        recursion( n - 1 ) ;
	    } else {
	       
	           System.out.println(n);
	       
	           }
	    }
	public static void main(String[] args) {
		
		recursion(10);
		
	}

}
