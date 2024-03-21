import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Keerthana", "1234567890", "24, Vizag");
        serializeCustomer(customer, "JavaObject.txt");

        System.out.println("Customer object serialized successfully.");
    }

    private static void serializeCustomer(Customer customer, String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(customer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}