public class Main {


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivan", "436");
        phoneBook.add("Anna", "454324");
        phoneBook.add("Obby", "+9988746");

        phoneBook.printAllNames();
    }
}
