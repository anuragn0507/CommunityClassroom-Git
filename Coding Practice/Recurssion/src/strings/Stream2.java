package strings;

public class Stream2 {
    public static void main(String[] args)
    {
        System.out.println(Skip( "baccdhha"));
        System.out.println(SkipApple( "baccappledhha appple anurag"));
        System.out.println(SkipNotApple( "baccappledhha apple anurag"));
}

    static String Skip( String up){

        if (up== ""){
            return "";
        }

        char ch = up.charAt(0);

        if(ch =='a'){
           return Skip( up.substring(1));
        }else{
           return ch + Skip(up.substring(1));
        }

    }

    static String SkipApple( String up){

        if (up== ""){
            return "";
        }

        char ch = up.charAt(0);

        //   for skipping the apple string
        if (up.startsWith("apple")) {
           return ch + SkipApple(up.substring(5));
        } else {
           return up.charAt(0) +SkipApple( up.substring(1));
        }

    }
    static String SkipNotApple( String up){

        if (up== ""){
            return "";
        }

        char ch = up.charAt(0);

        //   for skipping the apple string
        if (up.startsWith("app") && up.startsWith("apple") ) {
           return ch + SkipNotApple(up.substring(3));
        } else {
           return up.charAt(0) +SkipNotApple( up.substring(1));
        }

    }
}
