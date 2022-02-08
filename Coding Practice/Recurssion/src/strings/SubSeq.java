package strings;

import java.util.ArrayList;

public class SubSeq {
    // SubSeq is for Strings and Subset is for array

    public static void main(String[] args) {
        //subseq("", "abc");
        //subseqRet("", "abc");
        //System.out.println(subseqRet("", "abcd"));
        //subseqAscii("","abcde");

        System.out.println(subseqAssciiRet("", "av"));

    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

         char ch = up.charAt(0);

        subseq(p+ch, up.substring(1));
        subseq(p,up.substring(1));
        //
    }

   // Passing in the body of the function (it's the tough one please practice it)

    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

         char ch = up.charAt(0);

       ArrayList left= subseqRet(p+ch, up.substring(1));
       ArrayList right=  subseqRet(p,up.substring(1));

       left.addAll(right);
       return left;
    }

    //Print Ascii value with the string

    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqAscii(p+ch, up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p +(ch+0), up.substring(1));
        //
    }

    //Printing value with ascii value

    static ArrayList<String> subseqAssciiRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList first= subseqAssciiRet(p+ch, up.substring(1));
        ArrayList second=  subseqAssciiRet(p,up.substring(1));
        ArrayList third = subseqAssciiRet(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
