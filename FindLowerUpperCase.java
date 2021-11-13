import java.util.Scanner;

public class FindLowerUpperCase {
    public static void main(String[] args) {
        char ch;
        //Created scanner object for input
        Scanner scip=new Scanner(System.in);

        System.out.println("Enter the character: ");
        ch=scip.next().charAt(0);

        if(ch>='A' && ch<='Z') {
            System.out.println(ch +" is an Upper case letter");
        }
            else if(ch>='a'&& ch<='z'){
                System.out.println(ch+ " is an Lower case letter");
            }
            else{
            System.out.println("Entered value is not alphabets");


        }

    }
}
