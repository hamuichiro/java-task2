public class ArgsLastPrinter{
    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("�Ȃ�");
        } else{
            String str = args[args.length - 1];
            System.out.println(str);
        }
    }
}