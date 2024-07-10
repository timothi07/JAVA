package Strings;
public class StrIntConversion {
    public static void main(String args[]){
        String str = "12345";
        int num = Integer.parseInt(str);        // str to int
        System.out.println(num + ": String conveted to Integer");
        System.out.println(num + 11111);

        String str1 = Integer.toString(num);
        System.out.println(str1 + ": converted back to string");
    }
}
