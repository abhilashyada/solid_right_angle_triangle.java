import java.util.Scanner;

public class solid_right_angle_triangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        for (int i =1;i <= A;i++) {
            for (int j = (A - i)*2;j >=1; j--)
                System.out.print(" ");
            for (int j = 1;j <= i;j++)
                System.out.print("* ");
            System.out.println();
        } 
    }
}