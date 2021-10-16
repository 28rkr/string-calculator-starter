package calculator;

public class StringCalculator {

    public int add(String input) {
    	if(input.equals("")) {
    		return 0;
    	}
    	else {
    		String delimiter = ",";
    		if(input.matches("//.\n.*")) {
    			delimiter = Character.toString(input.charAt(2));
    			input=input.substring(4);
    		}
    		String s[] = input.split(delimiter + "|\n");
    		int total=0;
    		for(String num : s)
    			total=total + Integer.parseInt(num);
    		return total;
    	}

    }

}