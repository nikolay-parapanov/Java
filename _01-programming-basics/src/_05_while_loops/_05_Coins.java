package _05_while_loops;

import java.util.Scanner;

public class _05_Coins {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double amountChange = Double.parseDouble(sc.nextLine());
        double stotinki = amountChange * 100;
        double coins = 0;

        if (stotinki >=200) {
            coins += Math.floor(stotinki / 200);
            stotinki = stotinki % 200;
        }
        if (stotinki >= 100) {
            coins += Math.floor(stotinki/ 100);
            stotinki = stotinki % 100;
        }
        if (stotinki >= 50) {
            coins += Math.floor(stotinki/50);
            stotinki = stotinki %50;
        }
        if (stotinki>= 20) {
            coins += Math.floor(stotinki/20);
            stotinki = stotinki%20;
        }
        if (stotinki >=10) {
            coins += Math.floor(stotinki/10);
            stotinki = stotinki%10;
        }
        if (stotinki >=5) {
            coins += Math.floor(stotinki/5);
            stotinki = stotinki%5;
        }
        if (stotinki >= 2) {
            coins += Math.floor(stotinki/2);
            stotinki = stotinki%2;
        }
        if (stotinki >=1){
            coins += Math.floor(stotinki/1);
            stotinki = stotinki%1;
        }
        System.out.printf("%.0f", coins);
    }
}

