package Strings;

public class removespace {
    public static void main(String[]args){
        String name ="Muthu Murugan";
        String result = "";
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch!=' '){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
