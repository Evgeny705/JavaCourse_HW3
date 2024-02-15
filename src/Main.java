import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ArrayList<String> wordsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова (для завершения введите 'end'):");

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            }
            wordsList.add(word);
        }

        System.out.println("Список введенных слов:");
        for (String word : wordsList) {
            System.out.println(word);
        }

        scanner.close();

        // Task 2
        Map<String, Cats> catCollection = new HashMap<>();

        catCollection.put("Барсик", new Cats("Барсик", "рыжий"));
        catCollection.put("Мурзик", new Cats("Мурзик", "серый"));
        catCollection.put("Рыжик", new Cats("Рыжик", "рыжий"));
        catCollection.put("Матроскин", new Cats("Матроскин", "белый"));
        catCollection.put("Леопольд", new Cats("Леопольд", "черный"));
        catCollection.put("Том", new Cats("Том", "серый"));
        catCollection.put("Гарфилд", new Cats("Гарфилд", "рыжий"));
        catCollection.put("Котэ", new Cats("Котэ", "черный"));
        catCollection.put("Симба", new Cats("Симба", "рыжий"));
        catCollection.put("Чеширский", new Cats("Чеширский", "фиолетовый"));

        System.out.println("Список ключей:");
        for (String key : catCollection.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nСписок котов вместе с их цветом:");
        for (Cats cat : catCollection.values()) {
            System.out.println(cat.getName() + " - " + cat.getColor());
        }
    }
}
