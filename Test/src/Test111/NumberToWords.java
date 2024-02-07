package Test111;

public class NumberToWords {
    public static void main(String[] args) {
        int number = 47;

        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (number < 20) {
            System.out.println(units[number]);
        } else {
            int tensDigit = number / 10;
            int unitsDigit = number % 10;

            System.out.println(tens[tensDigit] + " " + units[unitsDigit]);
        }
    }
}
