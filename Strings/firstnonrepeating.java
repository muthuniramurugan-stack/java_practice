package Strings;

public class firstnonrepeating {
    public static void main(String[] args) {
        String name = "muthumurugan";
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            int count =0;
            for(int j=0;j<name.length();j++){
                if(ch==name.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(ch);
            }
        }
    }
}
