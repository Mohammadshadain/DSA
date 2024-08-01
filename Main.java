import java.util.Scanner;

/**
 * Main
 */
public class Main {
    
    public static int calSum(int a, int b){
      
        return (a+b);

    }

    public static void main(String[] args) {
        System.out.println("enter your number to add");
        Scanner ef=new Scanner(System.in);
        int a=ef.nextInt();
        int b=ef.nextInt();
        int sum=calSum(a, b);
        System.out.println("the additionnof two number is " + sum);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.next();
        System.out.println(name);
        Scanner dc=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=dc.nextInt();
        if (num%2==0) {
            System.out.println("even number");
            
        }else{
            System.out.println("odd number");
        }

        Scanner fc=new Scanner(System.in);
        int button=fc.nextInt();
        switch (button) {
            case 1:System.out.println("hello");
                
                break;
            case 2:System.out.println("hii");
            break;
            case 3:System.out.println("bagggg");
            break;    
        
            default: System.out.println("invaid");
               
        }
        for (int index = 0; index < 11; index++) {
            System.out.println(index);
            
        }
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=5; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }

    }
}