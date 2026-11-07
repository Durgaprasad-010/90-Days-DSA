import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n = sc.nextInt();
     for(int i=1;i<=n;i++){
      if(i==1||i==n){
             for(int x=0;x<n;x++){
              System.out.print("*");                                //Hollow Square
             }
      }
      else {
        for(int j=0;j<n;j++){
          if(j==0||j==n-1){
            System.out.print("*");
          }
          else {
            System.out.print(" ");
          }

        }
      }  System.out.println();
     }
    }
}
