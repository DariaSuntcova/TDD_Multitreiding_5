import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @ParameterizedTest
    @CsvSource({
            "Ivan, 221955, true",
            "Kerry, 89198525698, true",
            "Mama, +79501568741, true",
            "Daria, null, false",
            "null, 452369, false",
            "null, null, false"
    })
    public void shouldAdd(String name, String number, boolean expected) {

        Assertions.assertEquals(expected, phoneBook.add(name, number));
    }

    @ParameterizedTest
    @CsvSource({
            "Ivan, 221955",
    })
    public void shouldAddSameName(String name, String number) {
        phoneBook.add(name, number);

        Assertions.assertFalse(phoneBook.add(name, number));
    }

}
