package OopsExample;

public class MyString {

    private String original;
    private String reverse="";
    public MyString(String str){

        original=str;
    }
    public void reverseString(){

        for (int i=original.length()-1;i>=0;i--)
        {
            char ch = original.charAt(i);
            reverse=reverse+ch;
        }
    }
    public void showString(){

        System.out.println("original : "+original);
        System.out.println("its reverse : "+reverse);
    }


}

