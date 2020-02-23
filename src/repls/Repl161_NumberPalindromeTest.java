package repls;

import java.util.Scanner;

public class Repl161_NumberPalindromeTest {
    public static void main(String[] args) {
        int num = 1001, reverse = 0;
        while (num != 0) {
            int remainder = num % 10;
            System.out.println("remainder "+remainder);
            reverse = reverse * 10 + remainder;
            System.out.println("reversere "+reverse);
            num = num / 10;
            System.out.println("num " + num);
        }

            }

        }
