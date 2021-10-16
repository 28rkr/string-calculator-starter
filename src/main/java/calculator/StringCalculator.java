package calculator;

public class StringCalculator {

    public int add(String input) {
    	if(input.equals("")) {
    		return 0;
    	}
    	else if(input.contains(",")) {
    		String s[] = input.split(",");
    		return Integer.parseInt(s[0]) + Integer.parseInt(s[1]); 		
    	}
    	else {
    		return Integer.parseInt(input);
    	} 
    }

}