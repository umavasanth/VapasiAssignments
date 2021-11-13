import java.util.Scanner;

public class simpleCalc {
    public static void main(String[] args) {
        char ope;
        double num1,num2,result;

        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number1:  ");
        System.out.println("Enter number2:  ");
        num1=inp.nextDouble();
        num2=inp.nextDouble();
        System.out.println("Enter any operator(+, -, *, / )");

        ope=inp.next().charAt(0);

            switch (ope) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("You have entered wrong operator");
                    return;
            }

           inp.close();

        System.out.println(num1+" " +ope+"" +num2+"="+result);

    }
}
