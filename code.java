import java.util.Scanner;

public class Lab4_task1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] numbers = new int[10];

        System.out.print("Enter your 10 integers: ");

        for(int i=0;i<10;i++){
            numbers[i] = input.nextInt();
        }
        System.out.print("Enter a number to check: ");
        int num = input.nextInt();


        boolean found = false;
        for(int i =0; i<10;i++){
            if(numbers[i] == num){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }
    }
}
