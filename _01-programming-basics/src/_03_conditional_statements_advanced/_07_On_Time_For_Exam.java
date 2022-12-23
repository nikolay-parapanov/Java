package _03_conditional_statements_advanced;

import java.util.Scanner;

public class _07_On_Time_For_Exam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int examHour = Integer.parseInt(sc.nextLine());
        int examMinutes = Integer.parseInt(sc.nextLine());
        int arrivalHour = Integer.parseInt(sc.nextLine());
        int arrivalMinutes = Integer.parseInt(sc.nextLine());

        int totalExamMinutes = examHour * 60 + examMinutes;
        int totalArrivalMinutes = arrivalHour * 60 + arrivalMinutes;

        int differenceMinutes = totalExamMinutes - totalArrivalMinutes;

        String status = "";
        String arrivalPeriod = differenceMinutes < 0 ? "after" : "before";

        int printHours = 0;
        int printMinutes = 0;

        if (differenceMinutes >= 0 && differenceMinutes <= 30) {
            status = "On time";
        } else if (differenceMinutes > 30) {
            status = "Early";
        } else status = "Late";


        if (status == "Late"){
            differenceMinutes = Math.abs(differenceMinutes);
        }

        System.out.println(status);
        printMinutes = differenceMinutes % 60;

        if (differenceMinutes >= 60) {
            printHours = differenceMinutes / 60;
            System.out.printf("%d:%02d hours %s the start", printHours, printMinutes, arrivalPeriod);
        } else {
            System.out.printf("%02d minutes %s the start", printMinutes, arrivalPeriod);
        }
    }
}