package calculator;

public class StringCalculator {

    public int add(String input) {
    	if(input.equals("")) {
    		return 0;
    	}
    	else {
    		String s[] = input.split(",");
    		int total=0;
    		for(String num : s)
    			total=total + Integer.parseInt(num);
    		return total;
    	}

    }

}