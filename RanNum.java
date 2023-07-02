

import java.util.Random;
import java.util.Scanner;

class RanNum {

    public static int ranNum() {
        Random num = new Random();
        return num.nextInt(100);
    }

    public static boolean condition_true() {
        return true;
    }
    public static boolean condition_false() {
        return false;
    }

    public static void main(String argu[]) {

        System.out.println("Welcome");
        System.out.println("1).Start");
        System.out.println("2).Exit");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        if (ch == 1) {
            boolean condition = true;
            while (condition) {
                System.out.println("Guess the any number from 0 to 100");
                int user_in = sc.nextInt();
                int ran_num = ranNum();
                int times = 1;
                while (ran_num != user_in) {
                    if (ran_num > user_in) {
                        System.out.println("Enter the is number smaller the random number");
                        user_in = sc.nextInt();
                    } else {
                        System.out.println("Enter the is number greater the random number");
                        user_in = sc.nextInt();
                    }
                    times++;
                }
                    if (user_in == ran_num) {
                        System.out.println("Congratulation");
                        System.out.println("Random number: " + ran_num);
                        System.out.println("User enter:" + user_in);
                        System.out.println("Number of times you enter the nummber:" + times);
                    }
                    System.out.println("1).Play again");
                    System.out.println("2).Exit");
                    int in_first = sc.nextInt();
                    if (in_first == 1) {
                        condition = condition_true();
                        times = 0;
                        ran_num = 0;
                        user_in = 0;
                    } else {
                        condition = condition_false();
                        System.out.println("thank you");
                    }
                }
                sc.close();
        } else if (ch == 2) {
            System.out.println("thank you very much");
        } else {
            System.out.println("Sorry enter the valid number");
        }
    }
}
