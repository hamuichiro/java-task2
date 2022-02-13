public class FizzBuzz {
    public static void main(String[] args) {
        int number = 0;
        if (args.length != 0) {
            number = Integer.parseInt(args[0]);
        }
        for (int i = 1; i <= number; i ++) {
            String str = "";
            if (i % 3 == 0) {
                str += "Fizz";
            }
            if (i % 5 == 0) {
                str += "Buzz";
            }
            if (str == "") {
                str += i;
            }
            System.out.print(str + " ");
        }
    }
}