package codefinity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    private List<String> input;
    private List<String> expected;
    private List<String> actual;

    //ToDo: Remove the list creation for all the tests, replace it with list initialization
    @BeforeEach
    public void setUp() {
        List<String> input;
        List<String> expected;
        List<String> actual;
    }

    @Test
    public void testFilterAndSortPalindromes() {
        input = Arrays.asList("radar", "hello", "level", "world", "madam", "java");
        expected = Arrays.asList("radar", "level", "madam");
        actual = StringProcessor.filterAndSortPalindromes(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFilterAndSortPalindromesWithEmptyList() {
        input = Arrays.asList();
        expected = Arrays.asList();
        actual = StringProcessor.filterAndSortPalindromes(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFilterAndSortPalindromesWithNoPalindromes() {
        input = Arrays.asList("java", "hello", "world");
        expected = Arrays.asList();
        actual = StringProcessor.filterAndSortPalindromes(input);
        assertEquals(expected, actual);
    }

    //ToDo: Write a method that will test if the sorting in the method works correctly
    @Test
    public void testFilterAndSortPalindromesWithMultiplePalindromes(){
        input = Arrays.asList("world", "banana", "racecar", "bob", "Never odd or even");
        expected = Arrays.asList( "Never odd or even", "racecar", "bob");
        actual = StringProcessor.filterAndSortPalindromes(input);
        assertEquals(expected, actual);
    }
}