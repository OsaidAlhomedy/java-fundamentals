/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.checkerframework.checker.units.qual.A;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;


public class App {


    public static void main(String[] args) {
        Path path = Path.of("app/src/main/resources/gate.js");
        App newApp = new App();
        System.out.println(newApp.linter(path));

    }

    public String mapping(int[][] arr) {

        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> temps = new HashSet<>();
        String stringToBeReturned = "";

        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                unique.add(arr[i][j]);
                if (arr[i][j] < min)
                    min = arr[i][j];
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }

        for (int i = min + 1; i < max; i++) {
            temps.add(i);
        }

        stringToBeReturned = stringToBeReturned + "High: " + max + "\n" + "Low: " + min + "\n";

        for (Integer temp : temps) {
            if (!unique.contains(temp)) {
                stringToBeReturned = stringToBeReturned + "Never saw temperature: " + temp + "\n";
            }
        }

        return stringToBeReturned;

    }

    public String tally(List<String> list) {

        HashSet<String> uniques = new HashSet<>(list);
        HashMap<String, Integer> hashList = new HashMap<>();

        for (String item : uniques) {
            hashList.put(item, 0);
        }

        for (String vote : list) {
            if (hashList.containsKey(vote)) {
                Integer x = hashList.get(vote);
                x++;
                hashList.put(vote, x);
            }
            ;
        }

        int counter = 0;
        String winner = "none";
        for (String item : uniques) {
            if (hashList.get(item) > counter) {
                counter = hashList.get(item);
                winner = item;
            }
        }


        return winner;


    }

    public String linter(Path path) {
        int counter = 0;
        StringBuilder errorLine = new StringBuilder();
        try {
            File myFile = new File(path.toUri());
            Scanner scanner = new Scanner(myFile);

            while (scanner.hasNextLine()) {
                counter++;
                String data = scanner.nextLine();
                if (!data.endsWith(";") && !data.endsWith("}") && !data.endsWith("{") && !data.contains("else") && !data.contains("if") && !data.isEmpty() || data.contains("return") && !data.endsWith(";")) {
                    errorLine.append("Line ").append(counter).append(" : Missing semicolon.\n");
                }
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        return errorLine.toString();
    }


}
