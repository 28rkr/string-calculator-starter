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
    		
    		String string[] = input.split(delimiter + "|\n");
    		return sum(string);
    	}

    }
    
    private static int toInt(String numString){
		return Integer.parseInt(numString);
    }

	private int sum(String[] string) {
		String negativeString="";
		int total = 0;
		int negCount=0;
		
		for(String num : string) {
			if(toInt(num) < 0 ) {
				
				if(negCount==0)
					negativeString =num; 
				else
					negativeString =negativeString + "," + num;
					
				negCount++;
			}
			
			total = total + toInt(num);
		}
		
		if(negCount > 0){
			throw new IllegalArgumentException("negatives not allowed: " + negativeString);
		}
		
		return total;
	}

}