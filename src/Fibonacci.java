
public class Fibonacci {

	public static void main(String[] args) {
		
		int i;
		int fib[] = new int[10];
        fib[0] = fib[1] = 1; 
        
        for(i=2; i<10; i++)       
        	fib[i] = fib[i-1] +fib[i-2];
        
        for(i=0; i<10; i++)       
        	System.out.println("Fib[ "+i+" ] = "+fib[i]); 
		
	}

}
