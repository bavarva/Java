import java.util.Scanner;
public class fibonacci {
    static int fib(int position){
        int num=0;
            if(position==0){
                num=0;
            }
            else if(position==1 || position==2){
                num=1;
            }
            else{
                num=num+fib(position-1)+fib(position-2);
          
            }
            
            return num;
            

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the position of fibonacci series at which you want to find the number");
    n=sc.nextInt();
    System.out.println("The number at positon n in fibonacci series is");
    int num = fib(n);
    System.out.println(num);
    }
}
