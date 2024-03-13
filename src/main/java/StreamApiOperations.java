import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiOperations {
    public static String readWholeFile(String fileName){
        Path file = Paths.get("src/main/resources/" + fileName);
        try(Stream<String> stream = Files.lines(file)) {
            return stream.collect(Collectors.joining("\n"));
        } catch (IOException e) {
            System.out.println("Error! Can't get stream");;
        }
        return null;
    }

    public static int[] evenNumberFiltering(int[] numbers){
        return Arrays.stream(numbers).filter(e -> e % 2 == 0).toArray();
    }

    public static List<String> toUpperCaseString(List<String> list){
        return list.stream().map(String::toUpperCase).toList();
    }

    public static int getSum(int[] numbers){
        return Arrays.stream(numbers).reduce(0, Integer::sum);
    }

    public static List<String> sortedBySize(List<String> list){
        return list.stream().sorted(Comparator.comparingInt(String::length)).toList();
    }
}
