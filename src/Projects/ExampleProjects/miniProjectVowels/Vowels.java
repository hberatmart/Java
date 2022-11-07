package Projects.ExampleProjects.miniProjectVowels;

import Projects.Switch.Switch;

public class Vowels {
    public static void main(String[] args) {
        char vowel = 'f';

        switch (vowel){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Bold vowel");
                break;

            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("thin vowel");
                break;
            default:
                System.out.println("You entered an invalid character.");
        }
    }
}
