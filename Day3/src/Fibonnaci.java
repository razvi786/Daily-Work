import java.util.Scanner;

// System.out.println();

public class Fibonnaci{
    
    
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        int n;
        
        n=sc.nextInt();
        
        System.out.print("Fibonnaci Series till "+n+" is: ");
        
        int a=0,b=1,c;
        
        System.out.print(a+" "+b+" ");
        
        fib(a,b,n);
        
        System.out.println("Factorial is "+sum);
        
    }
    
    public static int fib(int n){
        
        if(n<=)
            return 1;
        
        return n*fact(n-1);
        
    }
    
}