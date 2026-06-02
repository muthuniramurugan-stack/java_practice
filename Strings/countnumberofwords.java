package Strings;

public class countnumberofwords {
    public static void main(String[] args) {
        String name = "hii how are you";
        int count = 1;
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
