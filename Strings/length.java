package Strings;

public class length {
    public static void main(String[] args) {
        String name = "Muthumurugan";
        int count = 0;
        try {
            while (true) {
                name.charAt(count);
                count++;
            }
        } catch (Exception e) {
            System.out.println(count);
        }

    }
}
