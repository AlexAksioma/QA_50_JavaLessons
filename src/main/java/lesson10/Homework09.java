package lesson10;

public class Homework09 {
    public static String removeDigits(String input){  //he1ll3o wo4rl7d9
        if(input == null || input.isBlank())
            return null;
        StringBuilder stringBuilder = new StringBuilder(input);
        for (int i = 0; i < stringBuilder.length(); i++) {
            char ch = stringBuilder.charAt(i);
            if(Character.isDigit(ch)){
                stringBuilder.deleteCharAt(i); //he1ll3o  --> hell3o  --> hello
                i--;
                //System.out.println(stringBuilder.length());
            }
        }
        return stringBuilder.toString();
    }
}
