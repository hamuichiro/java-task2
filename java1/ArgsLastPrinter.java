public class ArgsLastPrinter{
    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("‚È‚µ");
        } else{
            String str = "";
            for (int i = 0; i < args.length; i ++ ){
                str = args[i];
            }
            System.out.println(str);

        }
    }
}