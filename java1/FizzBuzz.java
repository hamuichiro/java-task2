public class FizzBuzz{
    public static void main(String[] args){
        int number = 0;
        if (args.length != 0){
            number =  Integer.parseInt(args[0]);
        }
        for (int i = 1; i <= number; i ++){
            if (i % 3 == 0){
                System.out.print("Fizz");
            }
            if (i % 5 == 0){
                System.out.print("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}