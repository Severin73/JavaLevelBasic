package com.javalevelbasic.task039;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.toMap;

/**
 * Read the text in English from the text file and output statistics on the frequency of use of letters in the text
 * (i.e., the letter is the number of uses), and the letters used most often should be displayed first.
 */
public class FrequencyOfLetters {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "englishText.txt");
        Map<Character, Integer> map = calcFrequency(path);

        printMap(map);
    }

    private static void printMap(Map<Character, Integer> map) {
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " used " + entry.getValue() + " times");
        }
    }

    public static Map<Character, Integer> calcFrequency(Path path) throws IOException {
        try (Stream<String> lines = Files.lines(path, UTF_8)) {
            Map<Character, Integer> map = lines.map(String::chars)
                    .flatMapToInt(identity())
                    .mapToObj(intValue -> (char) intValue)
                    .filter(Character::isLetter)
                    .map(Character::toLowerCase)
                    .collect(toMap(identity(), it -> 1, Integer::sum));

            return sort(map);
        }
    }

    public static Map<Character, Integer> sort(Map<Character, Integer> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }
}
