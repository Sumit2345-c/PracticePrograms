import java.util.Scanner;
public class CheckChar {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = s.next().charAt(0);
        if(Character.isAlphabetic(ch))
        {
        switch (ch)
        {
            case'a':
            case'e':
            case'i':
            case'o':
            case'u': System.out.println("Given Characteris Vowel"); break;
            default: System.out.println("Given Character is a Consonant");
        }
        }
        else
        System.out.println("Given Character is not an aplhabet");
    }
    
}