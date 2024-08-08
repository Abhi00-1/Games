package abhishek;

import java.util.Scanner;

public class TicTac {
    public static void main(String[] args) {
        game();
    }
    static void game() {
        boolean flag = true;
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8'};
        System.out.println("---Instructions---"+"player1(x) and player2(o),enter the position where u want to place it.");
        display(arr);
        System.out.println("* ** ***GOODLUCK FOR BOTH THE PLAYERS*** ** *");
        while (flag) {
            System.out.println("player 1");
            Scanner sc = new Scanner(System.in);
            int pos1 = sc.nextInt();
            System.out.println("player2");
            int pos2 = sc.nextInt();
            if (arr[pos1] == 'x') {
                System.out.println("error(REPLACING)");
                System.out.println("Game voilation "+"## Rematch ## ");
                game();
            }
            else if (arr[pos1] == 'o') {
                System.out.println("error(REPLACING)");
                System.out.println("Game voilation "+"## Rematch ## ");
                game();
            }
            else
                arr[pos1] = 'x';
            if (arr[pos2] == 'x') {
                System.out.println("error(REPLACING)");
                System.out.println("Game voilation "+"## Rematch ## ");
                game();
            }
            else if (arr[pos2] == 'o') {
                System.out.println("error(REPLACING");
                System.out.println("Game voilation "+"## Rematch ## ");
                game();
            }
            else
                arr[pos2] = 'o';
            display(arr);
            if (check(arr)) {
                System.out.println("for another match press 1 nor 0");
                int decision=sc.nextInt();
                if(decision==1)
                    game();
                else
                    flag=false;
            }
        }
    }
    static void display(char[] arr){
        for (int i = 0; i < 3; i++)
            System.out.print(arr[i] + " | ");
        System.out.println(" ");

        for (int i = 3; i < 6; i++)
            System.out.print(arr[i] + " | ");
        System.out.println(" ");
        for (int i = 6; i < 9; i++)
            System.out.print(arr[i] + " | ");
        System.out.println(" ");
    }
    static boolean check(char[] check){
        if((check[0]=='x'&& check[1]=='x' && check[2]=='x')||(check[0]=='x'&& check[3]=='x' && check[6]=='x')||(check[2]=='x' && check[5]=='x' && check[8]=='x')||(check[6]=='x' && check[7]=='x' && check[8]=='x')||(check[3]=='x' && check[4]=='x' && check[5]=='x')||(check[2]=='x' && check[4]=='x' && check[6]=='x')||(check[0]=='x' && check[4]=='x'&&check[8]=='x')||(check[1]=='x' && check[4]=='x' && check[7]=='x')){
            System.out.println("player 1 won");
            return true;
        }
        else if ((check[0]=='o'&& check[1]=='o' && check[2]=='o')||(check[0]=='o'&& check[3]=='o' && check[6]=='o')||(check[2]=='o' && check[5]=='o' && check[8]=='o')||(check[6]=='o' && check[7]=='o' && check[8]=='o')||(check[3]=='o' && check[4]=='o' && check[5]=='o')||(check[2]=='o' && check[4]=='o' && check[6]=='o')||(check[0]=='o' && check[4]=='o'&& check[8]=='o')||(check[1]=='o' && check[4]=='o' && check[7]=='o')) {
            System.out.println("player 2 won");
            return true;
        }
        else if((check[0]=='x'||check[0]=='o') && (check[1]=='x'||check[1]=='o') && (check[2]=='x'||check[2]=='o') && (check[3]=='x'||check[3]=='o') && (check[4]=='x'||check[4]=='o') && (check[5]=='x'||check[5]=='o') && (check[6]=='x'||check[6]=='o') && (check[7]=='x'||check[7]=='o') && (check[8]=='x'||check[8]=='o')){
            System.out.println("Sorry draw!!!!");
            System.exit(0);
        }
        return false;
    }
}


