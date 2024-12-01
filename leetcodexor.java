import java.util.*;
class leetcodexor{
    public static void main(String[]args){
        int nums=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter n :");
        int n=scan.nextInt();
        System.out.println("enter start :");
        int start =scan.nextInt();
        for(int i=0;i<n;i++){
            nums^=start+2*i;

        }
        System.out.println("the xor is : "+nums);
    }
}