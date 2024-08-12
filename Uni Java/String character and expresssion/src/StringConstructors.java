
public class StringConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray = { 'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y' };
		 String s = new String( "hello" );
		 
		 String s1 = new String();
		 String s2 = new String( s );
		 String s3 = new String( charArray );
		 String s4 = new String( charArray, 6, 3 );// 6 is the starting index and 3 is the 
		 //number of character that must be included in the string

		 System.out.printf("s = %s\n s1 = %s\n s2 = %s\n  s3 = %s\n s4 = %s\n", s, s1, s2, s3, s4);
		 
	}

}
