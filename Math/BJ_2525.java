package Math;

import java.util.Scanner;

public class BJ_2525 {
    //오븐 시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int how = sc.nextInt();

        minute +=how;
        while(minute>=60){
            hour++;
            minute -=60;
            if(hour==24){
                hour=0;
            }
        }

        System.out.println(hour+" "+minute);
    }
}
