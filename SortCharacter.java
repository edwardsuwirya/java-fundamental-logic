/*
Input one line of words (S) : Sample Case

Output
Vowel Characters : aaee
Consonant Characters : ssmplc

Input one line of words (S) : Next Case

Output
Vowel Characters : eea
Consonant Characters : nxtcs
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortCharacter {
    public static void main(String[] args) {
        if (args.length == 1) {
            String input = args[0];
            SortCharacter sc = new SortCharacter();
            sc.searchChar(input);
        } else {
            throw new RuntimeException("No input argument given");
        }
    }

    private final List<String> vowels = Arrays.asList("a", "i", "u", "e", "o");

    private void searchChar(String input) {
        List<String> strArr = Arrays.asList(input.split(""));
        List<String> vowelsResult = new ArrayList<>();
        List<String> consonantResult = new ArrayList<>();
        for (String c : strArr) {
            if (c.equals(" ")) {
                continue;
            }
            if (vowels.contains(c)) {
                vowelsResult.add(c.toLowerCase());
            } else {
                consonantResult.add(c.toLowerCase());
            }
        }
        System.out.println(String.join("", sort(vowelsResult)));
        System.out.println(String.join("", sort(consonantResult)));
    }

    private List<String> sort(List<String> sList) {
        List<String> result = new ArrayList<>();
        do {
            String temp = sList.get(0);
            result.add(temp);
            sList.remove(0);
            for (int j = 0; j <= sList.size() - 1; j++) {
                if (temp.equals(sList.get(j))) {
                    result.add(sList.get(j));
                    sList.remove(j);
                }
            }
        } while (sList.size() > 0);
        return result;
    }

}
