package strings;

public class Stream {
    public static void main(String[] args) {
        Skip("", "baccd");
    }

    static void Skip(String p, String up){

        if (up== ""){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch =='a'){
            Skip(p, up.substring(1));
        }else{
            Skip(p+ch,up.substring(1));
        }

    }

}
