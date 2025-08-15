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
        String strSpaces = "        ";
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
    }
}
