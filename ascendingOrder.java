import java.util.Scanner;

public class ascendingOrder {
    public static void main(String[] args) {
        int count;
        int temp;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");

        count = s.nextInt();
        int a[] = new int[count];

        System.out.println("Enter all the elements:");
        for (int i = 0; i < count; i++) {
            a[i] = s.nextInt();

        }
        s.close();
        for (int i = 0; i < count; i++) //take first element
        {
            for (int j = i + 1; j < count; j++)//compare with second element
            {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Array elements in Ascending order");
        for (int i = 0; i < count - 1; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[count-1]);

    }
}

