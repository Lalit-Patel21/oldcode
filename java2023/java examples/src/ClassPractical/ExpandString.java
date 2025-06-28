package ClassPractical;

public class ExpandString{

    public static String expandString(String str) {
        StringBuffer res = new StringBuffer();
        int j;
        for (int i = 0; i < str.length(); i++) {

            int count = str.charAt(i) - '0';

            StringBuffer temp = new StringBuffer();

            for (j = i + 2; str.charAt(j) != ')'; j++) {

                temp.append(str.charAt(j));
            }
            for (int k=0;k<count;k++)
            {
                res.append(temp);
            }
            i=j;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "3(ab)4(cd)";

        System.out.println(expandString(str));

    }
}
