package rekursi;

public class Recyrsi {
    String word;
    int i;

    Recyrsi(String word) {
        this.word = word;
        i = 0;
    }

    protected void recursionRecyrsi() {

        if (word.length() % 2 == 0) {
            if (word.charAt(i) == word.charAt(word.length() - (i + 1))) {
                if (i == word.length() - i) {
                    System.out.println("Word polindrom!");
                    return;
                }
            } else {
                System.out.println("Word not polindrom.");
                return;
            }
        } else {
            if (word.charAt(i) == word.charAt(word.length() - (i + 1))) {
                if (i == word.length() - (i + 1)) {
                    System.out.println("Word polindrom!");
                    return;
                }
            } else {
                System.out.println("Word not polindrom!");
                return;
            }
        }
        i++;
        recursionRecyrsi();
    }
}
