public class SecondLastDigitFinder {
    public static int getSecondLastDigit(int number) {
        return Math.abs(number / 10) % 10;
    }

    public static void main(String[] args) {
        int number = 123456;
        int secondLastDigit = getSecondLastDigit(number);
        System.out.println("Second last digit of " + number + " is: " + secondLastDigit);
    }
}
