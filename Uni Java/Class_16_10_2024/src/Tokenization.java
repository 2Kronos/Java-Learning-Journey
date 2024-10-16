import java.util.Scanner;
public class Tokenization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);

		  System.out.println("Enter a sentence: ");

		  String sentence = input.nextLine();

		  String[] words = sentence.split(" ");

		  for(String word:words){

		  StringBuilder modfiableWord = new StringBuilder(word);
		  modfiableWord.setCharAt(0, Character.toUpperCase(word.charAt(0)));

		System.out.printf("/n",words);
		}

	}

}
