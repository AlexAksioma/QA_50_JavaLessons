package lesson07;

public class HomeWork06_solution {
    public static void main(String[] args) {
        printCharIndex("Hello my friend", 'e');
        printCharIndex("Hello my friend", 'w');
        System.out.println(getQuantityChar("Hello my friend", 'e'));
        System.out.println(isPalindrome("anzqna"));   //Anna
    }

    static Boolean isPalindrome(String word) {    //an na      qwe r ewq
        if (word == null || word.isBlank()) {
            System.err.println("str is null or empty");
            return null;
        }
        for (int i = 0, j = word.length() - 1; i < word.length() / 2 && j > word.length() / 2; i++, j--) {
            char ch1 = word.charAt(i);
            char ch2 = word.charAt(j);
            System.out.println(ch1 + ":" + ch2);
            if(ch1 != ch2)
                return false;
        }
        return true;
    }

    public static void printCharIndex(String str, char sym) {
        if (str == null || str.isEmpty()) {
            System.out.println("str is null or empty");
            System.err.println("str is null or empty");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sym)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int getQuantityChar(String str, char sym) {
        if (str == null || str.isEmpty()) {
            System.out.println("str is null or empty");
            System.err.println("str is null or empty");
            return -1;
        }
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sym)
                result++;
        }
        return result;
    }
}
