import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int arr[]={1,4,2,9};
        for (int i : arr) {
            System.out.println(i);
            
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("inter the search number");
        int x=sc.nextInt();
        for (int i=0; i<arr1.length;i++) {
            
            if (arr1[i]==x) {
                System.out.println("the number is found" +  i);
                
            }
            
        }
    }
    
}
