package ClassPractical;

//pangram- a pangram is a sentence containing every letter in the English Alphabet.
public class CheckPangram {
    public static boolean checkPangram(String str){
        //        int []arr=new int[26];
        boolean []flag=new boolean[26];

        str=str.toLowerCase();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
//             int index = ch-97;
                int index = ch - 'a';
                flag[index]=true;
            }

        }

        for(boolean x: flag) {
            if (!x) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {

//        String str = "The Quick Brown fox jumps over the lazy dog";

//        String str = "Bawds jog,flick quartz, vex nymph";

        String str = "Bawds jog,flick quart";



        boolean result =  checkPangram(str);

        if(result) {
            System.out.println("Given String is pangram");
        } else {
            System.out.println("Given String is not Pangram");
        }

    }


}
