package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regexExamle_1 {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("(\\d+) divided by (\\d+)");
		Matcher matcher = pattern.matcher("10 divided by 2 ");
		
		if(matcher.find()) {
			String simplified = "Result \n"+ matcher.replaceFirst("$1/$2"); // $1 is first group, $2 is second group
			System.out.println(simplified);
			int result =Integer.valueOf(matcher.group(1))/Integer.valueOf(matcher.group(2));
			System.out.println("result " +result);		}
		
//		String CardNumber = "1234-2222-3333-4343";
//		
//		Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
//		Matcher matcher = pattern.matcher(CardNumber);
////		
//		String maskedCardNumber = matcher.replaceAll("XXXX-XXXX-XXX-");
//		System.out.println(maskedCardNumber);
		

//		if(matcher.find()){
//			System.out.println("found: " + matcher.group(1));
//		}

		
		
		
	}

}
