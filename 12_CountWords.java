import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine().trim();
        
        int count = 0;

        if (str.isEmpty()) {
            System.out.println("Number of words in given string: " + count);
        } else {
            count = 1;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                    count++;
                }
            }
            System.out.println("Number of words in given string: " + count);
        }
        input.close();
    }
}
