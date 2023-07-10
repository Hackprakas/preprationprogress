public class LastDigitSumCalculator {
    public static int sumLastDigits(int number1, int number2) {
        int lastDigit1 = Math.abs(number1) % 10;
        int lastDigit2 = Math.abs(number2) % 10;
        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {
        int number1 = 123;
        int number2 = 456;
        int sum = sumLastDigits(number1, number2);
        System.out.println("Sum of last digits of " + number1 + " and " + number2 + " is: " + sum);
    }
}
