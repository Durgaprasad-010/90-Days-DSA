public class Main
{
	public static void main(String[] args) {
   int a=12,b=36;
   if(b>a){
       b=b%a;
       if(b==0){
           System.out.print(a);           
           return;
           }
           else System.out.print(b);
           return;
   }
   else {
       a=a%b;
       if(a==0){
           System.out.print(b);
           return;
       }
       else System.out.print(a);
       return;
   }
   
	}
}
