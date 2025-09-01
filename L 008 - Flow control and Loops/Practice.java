import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
            // 1. Take a number as input from user.
            // 2. keep dividing the number by 2, till it becomes 0.
            // 3. if the number becomes even at any point then skip the iteration.
            // 4. if the number of times you have divided becomes 5 or more, then break the loop.
            // 5. print the odd numbers.
        
        int num = 0;
        System.out.println("Enter a number");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        int copy = num;
        int times = 0;
        // First Approach
        while(num>0){
            num = num/2;
            times++;
            if(times >= 5 ){
                System.out.println("Exit the loop");
                break;
            }
            if(num%2==0){
                continue;
            }else{
                System.out.println("Number is "+ num);
            }
        }
        System.out.println("------Second Approach------");
        // Second Approach
        times = 0;
        while(copy>0){
            copy = copy/2;
            times++;
            if(times >= 5 ){
                System.out.println("Exit the loop");
                break;
            }
            // if odd then print otherwise it will automatically go 
            // to the next iteration as loop block ends after this
            // if statement.
            if(copy%2!=0){
                System.out.println("Number is "+ copy);
            }
        }
    }
}
