package calculator;

public class StringCalculator {

    public int add(String input) {
    	if(input.equals("")) {
    		return 0;
    	}
    	else {
    		return Integer.parseInt(input);
    	} 
    }

}