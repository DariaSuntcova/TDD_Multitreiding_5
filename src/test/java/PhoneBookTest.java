import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    String name = "Ivan";
    String number = "89198525698";

    @ParameterizedTest
    @CsvSource({
            "Ivan, 221955, true",
            "Kerry, 89198525698, true",
            "Mama, +79501568741, true",
    })
    public void shouldAdd(String name, String number, boolean expected) {

        Assertions.assertEquals(expected, phoneBook.add(name, number));
    }

    @Test
    public void shouldAddNullName() {

        Assertions.assertFalse(phoneBook.add(null, "452369"));
    }

    @Test
    public void shouldAddNullNumber() {
        Assertions.assertFalse(phoneBook.add("Ivan", null));
    }


    @ParameterizedTest
    @CsvSource({
            "Ivan, 221955",
    })
    public void shouldAddSameName(String name, String number) {
        phoneBook.add(name, number);

        Assertions.assertFalse(phoneBook.add(name, number));
    }

    @Test
    public void shouldFindByNumber() {
        phoneBook.add(name, number);

        Assertions.assertEquals(name, phoneBook.findByNumber(number));
    }

    @Test
    public void shouldFindByNumberNoMatches() {
        Assertions.assertNull( phoneBook.findByNumber("221985"));
    }

    @Test
    public void shouldFindByName() {
        phoneBook.add(name, number);

        Assertions.assertEquals(number, phoneBook.findByName(name));
    }

    @Test
    public void shouldFindByNameNoMatches() {
        Assertions.assertNull( phoneBook.findByName(name));
    }


}
