package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (Character.isAlphabetic(character)) {
            character = Character.toLowerCase(character);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'y') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }

    }
}
