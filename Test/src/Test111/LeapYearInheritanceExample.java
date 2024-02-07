package Test111;
class Year {
    protected int year;

    public Year(int year) {
        this.year = year;
    }

    public void checkLeapYear() {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

class LeapYear extends Year {
    public LeapYear(int year) {
        super(year);
    }
}

public class LeapYearInheritanceExample {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear(2024);
        leapYear.checkLeapYear();
    }
}
