package streamsQuestionTwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsQuestionTwo {
//Create a method that takes a list of Integers and returns a new list comprised of only the prime numbers, sorted smallest to biggest
		
	public static boolean Prime(int a) {
			       
        if(a == 0 | a == 1) {
    	   return false;
        }
        else {     
          for(int i = 2; i < a/2; i ++ ) {
        	if((a % i == 0)) { 
        		return false;
			}
        }
        return true;
        } 	        
	}
	public static void main(String[] args) {
				
			List<Integer> primeList = Arrays.asList(10,7,3,9,11);
			List<Integer> arePrimes = primeList.stream().filter(num -> Prime(num)).collect((Collectors.toList()));
			arePrimes.forEach(System.out::println); 
	}
}
