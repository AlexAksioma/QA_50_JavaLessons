package lesson06;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello QA50";  //Pool
        String str2 = "Hello QA50";
        String str3 = new String("Hello QA50");
        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3);//false
        str1 = str1 + "!";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("==============================");
        System.out.println(str1);
        String strEmpty = "";
        String strSpaces = "        ";  //length  = 8
        String strNull = null;
        System.out.println(str1.length());
        System.out.println(strEmpty.length());  //0
        //System.out.println(strNull.length());   //error
        System.out.println(str1.isEmpty());
        System.out.println(strEmpty.isEmpty());
        System.out.println("===========================");
        System.out.println(str1.isBlank());
        System.out.println(strEmpty.isBlank());
        System.out.println(strSpaces.isBlank());
        System.out.println("===========================");
        System.out.println(str2);  //Hello QA50
        System.out.println(str1);  //Hello QA50!
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));
        System.out.println(str1.contains(str2));  //true
        System.out.println(str2.contains(str1));  //false
        System.out.println(str2.contains(str2));  //true
        System.out.println("============================");
        textContainsStr("To be or not to be", "or not to");
        textContainsStr("To be or not to be", "or not to be not");
        textContainsStr("To be or not to be", "to be or not to be");
        textContainsStr("To be or not to be", "To_be or not to be");
        System.out.println("============================");
        String str6 = "Ivan Ivanov";
        String str7 = "ivan ivanov";
        System.out.println(str6.equals(str7));  //false
        System.out.println(str6.equalsIgnoreCase(str7));  //true
        System.out.println("================================");
        System.out.println(str6); //Ivan Ivanov
        char ch = str6.charAt(0);
        System.out.println("ch " + ch);
        char lastChar = str6.charAt(str6.length() - 1); //v  10
        System.out.println("lastChar " + lastChar);
        System.out.println("====================");
        System.out.println(findCharInString("Ivan Ivanov", 'n'));
        System.out.println(findCharInString("Ivan Ivanov", '!'));
    }

    static boolean findCharInString(String str, char ch) {
        if (str == null || str.isEmpty())
            return false;
        for (int i = 0; i < str.length(); i++) {  //Ivan  a
            char current = str.charAt(i);
            if (current == ch)      //I!=a  v!=a  a==a
                return true;
        }
        return false;
    }

    static void textContainsStr(String text, String str) {
        if (text == null || str == null) {
            System.out.println("wrong input");
            return;
        }
        if (text.contains(str))
            System.out.println(text + " -contains \n" + str);
        else
            System.out.println(text + " -not contains \n" + str);
    }
}
