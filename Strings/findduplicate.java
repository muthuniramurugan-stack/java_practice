package Strings;
public class findduplicate {
    public static void main(String[] args) {
        String name = "muthumurugan";
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    System.out.println("Duplicate Element is: " + name.charAt(i));
                    break;
                }
            }
        }
    }
}