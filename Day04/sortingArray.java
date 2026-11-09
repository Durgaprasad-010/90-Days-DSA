
public class Main
{
	public static void main(String[] args) {
   
   int a[]={1,2,2,4,5,6};
   for(int i=0;i<a.length-1;i++){
       if(a[i]>a[i+1]){
System.out.print("array is not in sorted way");
return;
       }
   }
   System.out.print("array is sorted");
   return;
	}
}
