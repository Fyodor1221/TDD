import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneBookTest {
    @Test
    public void testAddNew() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Pavel", "00001");
        int actual = phoneBook.add("Sveta", "00002");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddSame() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Pavel", "00001");
        phoneBook.add("Sveta", "00002");
        int actual = phoneBook.add("Pavel", "00003");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Pavel", "00001");
        phoneBook.add("Sveta", "00002");
        String actual = phoneBook.findByNumber("00001");
        String expected = "Pavel";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Pavel", "00001");
        phoneBook.add("Sveta", "00002");
        String actual = phoneBook.findByName("Sveta");
        String expected = "00002";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Pavel", "00001");
        phoneBook.add("Sveta", "00002");
        phoneBook.add("Anton", "00003");
        ArrayList<String> actual = phoneBook.printAllNames();
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Anton", "Pavel", "Sveta"));
        Assertions.assertEquals(expected, actual);
    }
}
