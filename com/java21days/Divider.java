
class Divider {
    public static void main(String[] arguments) {
        float number1 = 10;
        float number2 = 6;
        float result = number1 / number2;
       float leftover = number1%number2; 
        System.out.println(number1 + " divided by " + number2);
        System.out.println("\nResult\tleftover");
        System.out.println(result + "\t" + leftover);
    }
}