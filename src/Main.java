import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n-------------------------- TASK 1 --------------------------\n");

        // Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
        // stringus (Jonas Jonaitis). Atspausdinti trumpesnį stringą.

        String name = "Christian";
        String surname = "Bale";

        if (name.length() > surname.length()) {
            System.out.println(surname);
        }
        else {
            System.out.println(name);
        }

        System.out.println("\n-------------------------- TASK 2 --------------------------\n");

        // Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
        // stringus. Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms.

        String name1 = "Christian";
        String surname1 = "Bale";

        System.out.println(name.toUpperCase() + " " + surname.toLowerCase());

        System.out.println("\n-------------------------- TASK 3 --------------------------\n");

        // Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
        // stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš pirmų vardo ir
        // pavardės kintamųjų raidžių. Jį atspausdinti.

        String name2 = "Christian";
        String surname2 = "Bale";
        String initials = name2.substring(0, 1) + surname2.substring(0, 1);
        System.out.println(initials);

        System.out.println("\n-------------------------- TASK 4 --------------------------\n");

        // Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
        // stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš trijų paskutinių vardo ir
        // pavardės kintamųjų raidžių. Jį atspausdinti.

        String name3 = "Christian";
        String surname3 = "Bale";
        String merged = name3.substring(name3.length() - 3)
                + surname3.substring(surname3.length() - 3);

        System.out.println(merged);

        System.out.println("\n-------------------------- TASK 5 --------------------------\n");

        // Sukurti kintamąjį su stringu: "An American in Paris". Jame visas “a” (didžiąsias ir
        // mažąsias) pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.

        String movieTitle = "An American in Paris";
        String newMovieTitle = movieTitle.replace('A', 'a').replace('a', '*');

        System.out.println(newMovieTitle);

        System.out.println("\n-------------------------- TASK 6 --------------------------\n");

        // Sukurti kintamąjį su stringu: "An American in Paris". Jame ištrinti visas balses.
        // Rezultatą atspausdinti. Kodą pakartoti su stringais: "Breakfast at Tiffany's", "2001: A
        // Space Odyssey" ir "It's a Wonderful Life".

        String movieTitle1 = "An American in Paris";
        String movieTitle2 = "Breakfast at Tiffany's";
        String movieTitle3 = "2001: A Space Odyssey";
        String movieTitle4 = "It's a Wonderful Life";

        System.out.println(movieTitle1.replaceAll("[aeiyouAEIYOU]", ""));
        System.out.println(movieTitle2.replaceAll("[aeiyouAEIYOU]", ""));
        System.out.println(movieTitle3.replaceAll("[aeiyouAEIYOU]", ""));
        System.out.println(movieTitle4.replaceAll("[aeiyouAEIYOU]", ""));

        System.out.println("\n-------------------------- TASK 7 --------------------------\n");

        // Stringe, kurį generuoja toks kodas: String  starWars = "Star Wars: Episode "+ "
        // ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1)
        // + " - A New Hope"; Surasti ir atspausdinti epizodo numerį.

        String  starWars = "Star Wars: Episode "+ " "
                .repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        // System.out.println(starWars.replaceAll("[Star Ws:Epiode]", ""));
        System.out.println(starWars.substring(starWars.length() - 14, starWars.length() - 13));

        System.out.println("\n-------------------------- TASK 8 --------------------------\n");

        // Suskaičiuoti kiek stringe “Don't Be a Menace to South Central While Drinking Your Juice
        // in the Hood” yra žodžių trumpesnių arba lygių nei 5 raidės. Pakartokite kodą su stringu
        // “Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale”.

        String sentence1 = "Don't Be a Menace to South Central While Drinking Your Juice in the Hood";
        String sentence2 = "Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale";
        int maxLength = 5;
        int wordCount = 0;
        String[] words1 = sentence1.split(" ");
        // System.out.println(Arrays.toString(words1));
        for (String word : words1) {
            String normalizedWord = word.trim().replaceAll(",", "");
            //System.out.println(word);
            if (normalizedWord.length() <= maxLength) {
                wordCount++;
            }
        }
        System.out.println(wordCount);

        git config --global user.email "dainius0820@gmail.com"
        git config --global user.name "Dainius0820"













































        // END OF METHOD AND CLASS
    }
}