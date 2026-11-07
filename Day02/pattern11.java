import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);                   //Hollow Pyramid
     int n=sc.nextInt();
   for(int i=1;i<=n;i++){
    for(int j=1;j<2*n;j++){
     
     
      if(j==n-i+1||j==n+i-1||i==n) {
        System.out.print("*");
      }
      else System.out.print(" ");
    }
          
    System.out.println();
   }
    }
    }

