import java.util.Scanner;
import java.util.Random;

public class guessthennumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Random rand = new Random();
        int a = rand.nextInt(1,101);
        int c=1;
        System.out.println("enetr nuumber of user");
        int v = input.nextInt();
        int [] arr = new int[v];
        for(int h=1;h<=v;h++){
          System.out.println("user "+h+" game starts");
           while(true){
            System.out.println("enetr your choise number between 1 to 100");
            int b = input.nextInt();
            if(b>a){
                System.out.println("choose smaller character than "+b);
                c=c+1;
                continue;
            }
            else if(b<a){
                System.out.println("choose bigger charracter than "+b);
                c=c+1;
                continue;
            }
            else{
                System.out.println("thatt is the number\n you won!!!!!");
                System.out.println("user "+h+" completed this game in "+c+" turns\n");
                arr[h-1]=c;
                c=1;
                a = rand.nextInt(1,101);
                break;
            }
        }
        }/* 
        for(int k=0;k<v;k++){
         // System.out.println("user "+(k+1)+"completes in ");
         // System.out.println(arr[k]);
          int min =arr[0];
          if(min>arr[k]){
            min=arr[k];
          }
          System.out.println("user "+(k+1)+"\nwins !!!"+"with "+min);
          
        }*/
    }
    
}
