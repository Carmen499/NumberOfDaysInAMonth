package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {

        if (year <= 1 || year > 9999) {
            return false;
        }

        if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(" The year is a leap year (it has 366 days)");
            return true;
        } else {
            System.out.println(" The year is not a leap year (it has 365 days)");
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 2:
                if (isLeapYear(year)){
                    return 29;
                }else{
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

        }
        return -1;
    }
}





