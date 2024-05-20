package org.example.Enum;

import static org.example.Enum.DayOfWeek.TUE;

public class MAIN {

    public static void disStudyMsg(DayOfWeek day) {
        switch (day) {
            case MON:
            case WED:
            case FRI:
                System.out.println("Java coding day");
                break;
            case TUE:
            case THURS:
                System.out.println("Reading day");
                break;
            case SAT:
            case SUN:
                System.out.println("Getting rest day");
                break;
            default:
                throw new IllegalArgumentException("No supported day: " + day);
        }
    }


    public static void main(String[] args) {
        disStudyMsg(TUE);

        DayOfWeek[] arr = DayOfWeek.values();
        for (DayOfWeek day : arr) {
            System.out.println(day);
        }

    }
}
