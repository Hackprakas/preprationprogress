public class LastDigitFinder {
    public static int getLastDigit(int number) {
        return Math.abs(number) % 10;
    }

    public static void main(String[] args) {
        int number = 123456;
        int lastDigit = getLastDigit(number);
        System.out.println("Last digit of " + number + " is: " + lastDigit);
    }
}
