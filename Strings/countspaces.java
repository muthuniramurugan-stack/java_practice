package Strings;

public class countspaces {
    public static void main(String[] args) {
        String name = "hii how are you";    
        int count = 0;
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
