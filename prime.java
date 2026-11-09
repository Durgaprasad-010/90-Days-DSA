public class Main
{
	public static void main(String[] args) {
	   int n=36;
	   int count=0;
	   for(int i=1;i*i<=n;i++){
	       if(n%i==0){                           // time complexity of square root of n 
                                               //it prints both the divisors and count 
	           count++;
	           System.out.print(i+" ");
	       }
	       if((n/i)!=i){
	           count++;
	           System.out.print(n/i+" ");
	       }
	   }
	   System.out.println("\n"+count);
	}
}
