// * Написать метод, который переведет число из римского формата записи в арабский. Например, MMXXII = 2022

import java.util.HashMap;
import java.util.Map;
public class Hw5 {
    public static void main(String[] args) {
        // String str = "MMXXII";
        // String str = "MMMCMXCIX";
        String str = "DCCC";
        // String str = "IV";
        // String str = "LXXXIII";
        String[] arrStr = str.split("");
        Map<String, Integer> map = new HashMap<>(); // создаем map с ключами/значениями римские/арабские цифры
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int[] arrInt = new int [str.length()];
        for (int i = 0; i < arrStr.length; i++) {   // создаём массив из значений map с арабскими цифрами полученных из числа введенного пользователем
            arrInt [i] = map.get(arrStr[i]);
        }
        int superresult = convertToArabian(arrInt, 0, 0);
        System.out.println(str + " -> " + superresult);
    }
    public static int convertToArabian(int[]arr, int result, int k) {
        if (k >= arr.length - 1)
            return result += arr[arr.length-1];
        if (arr[k] >= arr[k + 1]){
            result += arr[k];                            
            }                                 
        else {
            result -= arr[k];             
        } 
        k++;
        return convertToArabian(arr, result, k);     
    }
}

// Написать метод, который переведёт данное целое число в римский формат

import java.util.HashMap;
public class Hw5 {
    public static void main(String[] args) {        
        String num = "MDLXIV"; // = 1564
        HashMap<Character, Integer> letterHashMap = new HashMap<>();
        letterHashMap.put('M', 1000);
        letterHashMap.put('D', 500);
        letterHashMap.put('C', 100);
        letterHashMap.put('L', 50);
        letterHashMap.put('X', 10);
        letterHashMap.put('V', 5);
        letterHashMap.put('I', 1);   
        
        int result = 0;
        for (int i = 0; i < num.length() - 1; i++) {           
            if (letterHashMap.get(num.charAt(i)) < letterHashMap.get(num.charAt(i + 1)))
                result -= letterHashMap.get(num.charAt(i));
            else 
                result += letterHashMap.get(num.charAt(i));  
        }
        System.out.println(result + letterHashMap.get(num.charAt(num.length() - 1)));
    }
}