package exam.firstexam;

import java.util.ArrayList;
import java.util.Arrays;

public class FightAgainstLandlords {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>(Arrays.asList(" ♥1 ", " ♥2 ", " ♥3 ", " ♥4 ", " ♥5 ", " ♥6 ", " ♥7 ", " ♥8 ",
                " ♥9 ", " ♥10 ", " ♥J ", " ♥Q ", " ♥K ", " ♥A ",
                " ♠1 ", " ♠2 ", " ♠3 ", " ♠4 ", " ♠5 ", " ♠6 ", " ♠7 ", " ♠8 ", " ♠9 ", " ♠10 ", " ♠J ", " ♠Q ", " ♠K ", " ♠A ",
                " ♣1 ", " ♣2 ", " ♣3 ", " ♣4 ", " ♣5 ", " ♣6 ", " ♣7 ", " ♣8 ", " ♣9 ", " ♣10 ", " ♣J ", " ♣Q ", " ♣K ", " ♣A ",
                " ♦1 ", " ♦2 ", " ♦3 ", " ♦4 ", " ♦5 ", " ♦6 ", " ♦7 ", " ♦8 ", " ♦9 ", " ♦10 ", " ♦J ", " ♦Q ", " ♦K ", " ♦A ",
                " 大王 ", " 小王 "));
        ArrayList<Integer> landlord = new ArrayList<>(Arrays.asList(0, 0, 3));
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            int temp = (int) (Math.random() * (landlord.size()));
            arr[i] = landlord.get(temp);
            landlord.remove(temp);
        }

        if (arr[0] == 3) {
            System.out.println("地主");
        } else {
            System.out.println("农民");
        }

        for (int i = 0; i < 17 + arr[0]; i++) {
            int temp = (int) (Math.random() * (poker.size()));
            System.out.print(poker.get(temp));
            poker.remove(temp);
        }

        System.out.println();

        if (arr[1] == 3) {
            System.out.println("地主");
        } else {
            System.out.println("农民");
        }

        for (int i = 0; i < 17 + arr[1]; i++) {
            int temp = (int) (Math.random() * (poker.size()));
            System.out.print(poker.get(temp));
            poker.remove(temp);
        }
        System.out.println();

        if (arr[2] == 3) {
            System.out.println("地主");
        } else {
            System.out.println("农民");
        }

        for (int i = 0; i < 17 + arr[2]; i++) {
            int temp = (int) (Math.random() * (poker.size()));
            System.out.print(poker.get(temp));
            poker.remove(temp);
        }
    }
}
