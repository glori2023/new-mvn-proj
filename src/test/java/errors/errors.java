package errors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class errors {
    public static void main(String[] args) {
int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("input 1t num");
             a = sc.nextInt();
            System.out.println("input 2d num");
             b = sc.nextInt();
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.err.println("Wrong num format. Use int only");
            return;// выход из метода
        }

        try{ System.out.println(a/b);
        }catch (Exception e){e.printStackTrace();
            System.out.println(a/1);
        }


        System.out.println("end");
    }
}
