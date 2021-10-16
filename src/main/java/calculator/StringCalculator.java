package calculator;

public class StringCalculator {

    public int add(String input) {
    	if(input.equals("")) {
    		return 0;
    	}
    	
    	else {
    		String delimiter = ",";
    		if(input.matches("//(.*)\n(.*)")) {
    			int index = input.indexOf("\n");
    			delimiter = input.substring(2, index);
    			input=input.substring(index+1);
    		}
    		
    		String string[] = input.split(delimiter + "|\n");
    		return sum(string);
    	}

    }
    
    private static int toInteger(String numString){
		return Integer.parseInt(numString);
    }

	private int sum(String[] string) {
		String negativeString="";
		int total = 0;
		int negCount=0;
		
		for(String num : string) {
			if(toInteger(num) < 0 ) {
				
				if(negCount==0)
					negativeString =num; 
				else
					negativeString =negativeString + "," + num;
					
				negCount++;
			}
			
			if(toInteger(num) <= 1000)
				total = total + toInteger(num);
		}
		
		if(negCount > 0){
			throw new IllegalArgumentException("negatives not allowed: " + negativeString);
		}
		
		return total;
	}

}