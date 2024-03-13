import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
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
}
