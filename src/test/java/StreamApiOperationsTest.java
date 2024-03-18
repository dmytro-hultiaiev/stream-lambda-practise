import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApiOperationsTest {

    @Test
    void wrongReadWholeFile(){
        String string = StreamApiOperations.readWholeFile("test.txt");
        Assertions.assertEquals(string, null);
    }

    @Test
    void readWholeFile() {
        String string = StreamApiOperations.readWholeFile("file.txt");
        Assertions.assertEquals(string, "Cute cat.\n" +
                                            "Angry dog.\n" +
                                            "Pretty woman.");
    }

    @Test
    void evenNumberFiltering(){
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        int[] evenNumbers = {0,2,4,6,8};
        Assertions.assertArrayEquals(evenNumbers, StreamApiOperations.evenNumberFiltering(numbers));
    }

    @Test
    void toUpperCaseString(){
        List<String> strings = new ArrayList<>();
        strings.add("Cat");
        strings.add("Dog");
        strings.add("Snake");

        List<String> stringsUpper = new ArrayList<>();
        stringsUpper.add("CAT");
        stringsUpper.add("DOG");
        stringsUpper.add("SNAKE");

        Assertions.assertEquals(stringsUpper, StreamApiOperations.toUpperCaseString(strings));
    }

    @Test
    void getSum(){
        int[] num = {0,1,2,3,-2,6,1,9,10};
        int sum = 30;
        Assertions.assertEquals(sum, StreamApiOperations.getSum(num));
    }

    @Test
    void sortedBySize(){
        List<String> list = new ArrayList<>();
        list.add("Cat");
        list.add("Snake");
        list.add("Dog");
        list.add("Elephant");
        list.add("Horse");

        List<String> sortedList = new ArrayList<>();
        sortedList.add("Cat");
        sortedList.add("Dog");
        sortedList.add("Snake");
        sortedList.add("Horse");
        sortedList.add("Elephant");

        Assertions.assertEquals(sortedList, StreamApiOperations.sortedBySize(list));
    }

    @Test
    void checkLetter(){
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("christmas");
        list.add("crazy");

        Assertions.assertTrue(StreamApiOperations.checkLetter(list, 'c'));
    }

    @Test
    void deleteNull(){
        List<String> list = Arrays.asList("car", null, null, "dog", "cat", null);
        List<String> correctList = Arrays.asList("car", "dog", "cat");

        Assertions.assertEquals(correctList, StreamApiOperations.deleteNull(list));
    }

    @Test
    void deleteDuplicates(){
        List<String> list = Arrays.asList("car", "car", "dog", "cat", "dog");
        List<String> correctList = Arrays.asList("car", "dog", "cat");

        Assertions.assertEquals(correctList, StreamApiOperations.deleteDuplicates(list));
    }
}
