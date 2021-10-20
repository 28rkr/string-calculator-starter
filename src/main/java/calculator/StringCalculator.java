package calculator;

public class StringCalculator {

    public int add(String input) {
    	String str="none";
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
    		if(input.startsWith("E")) {
    			input=input.substring(1);
    			str="even";
    		}
    		
    		if(input.startsWith("O")) {
    			input=input.substring(1);
    			str="odd";
    		}
    		
    		
    		String string[] = input.split(delimiter + "|\n");
    		return sum(string,str);
    	}

    }
    
    private static int toInteger(String numString){
		return Integer.parseInt(numString);
    }

	private int sum(String[] string,String str) {
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
			
			if(toInteger(num) <= 1000) {
				if (str.equals("even"))
					if(toInteger(num)%2==0)
				total = total + toInteger(num);
				
				if (str.equals("odd"))
					if(toInteger(num)%2==1)
				total = total + toInteger(num);
				
				if (str.equals("none"))
				total = total + toInteger(num);
			}
		}
		
		if(negCount > 0){
			throw new IllegalArgumentException("negatives not allowed: " + negativeString);
		}
		
		return total;
	}

}