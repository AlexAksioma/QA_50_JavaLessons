package lesson09;

import java.io.StringBufferInputStream;

public class HomeWork08_solution {
    public static void main(String[] args) {
        System.out.println(repeat_Java17("Ivan", 5));
        System.out.println(repeat_Java21("Ivan", 5));
        System.out.println(replaceSymbol("To be or not", 'o', '@'));
        System.out.println(removeDigits("he1ll3o wo4rl7d9"));
        System.out.println(toCamelCase("My   new   CAR z"));
    }

    public static String toCamelCase(String input){     // My  new  CAR --> myNewCar
        if(input == null || input.isBlank())
            return null;
        String[] array = input.trim().split("\\s+"); //  [My]  [new]  [CAR]
        StringBuilder stringBuilder = new StringBuilder(array[0].toLowerCase());
        for (int i = 1; i < array.length; i++) {
            stringBuilder.append(Character.toUpperCase(array[i].charAt(0)))//n-->N-->myN
                    .append(array[i].substring(1).toLowerCase());//myNew
        }
        return stringBuilder.toString();
    }

    static String removeDigits(String input){  //he1ll3o wo4rl7d9
        if(input == null || input.isBlank())
            return null;
        StringBuilder stringBuilder = new StringBuilder(input);
        for (int i = 0; i < stringBuilder.length(); i++) {
            char ch = stringBuilder.charAt(i);
            if(Character.isDigit(ch)){
                stringBuilder.deleteCharAt(i); //he1ll3o  --> hell3o  --> hello
                i--;
                System.out.println(stringBuilder.length());
            }
        }
        return stringBuilder.toString();
    }

    static String replaceSymbol(String input, char symbol, char replacement){
        if(input == null || input.isEmpty())
            return null;
        StringBuilder stringBuilder = new StringBuilder(input);
        for (int i = 0; i < input.length(); i++) {
            if(stringBuilder.charAt(i) == symbol)
                stringBuilder.setCharAt(i, replacement);
            //stringBuilder.replace(i, i+1, Character.toString(replacement));
        }
        return stringBuilder.toString();
    }

    static String repeat_Java17(String word, int times){       //Ivan Ivan Ivan
        if(word == null || word.isEmpty() || times <1){
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < times-1; i++) {
            stringBuilder.append(word).append(":");
        }
        return stringBuilder.append(word).toString();
    }

    static String repeat_Java21(String word, int times) {       //Ivan Ivan Ivan
        if (word == null || word.isEmpty() || times < 1) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.repeat(word, times);
        return stringBuilder.toString();
    }
}
