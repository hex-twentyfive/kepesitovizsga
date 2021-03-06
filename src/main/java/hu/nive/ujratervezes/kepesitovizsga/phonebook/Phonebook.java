package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {


    public void exportPhonebook(Map<String, String> contacts, String output) {
        handlesTheExceptions(contacts, output);

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(output))) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {

                bufferedWriter.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }


    private void handlesTheExceptions(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException("Parameter with null or empty value is not allowed!");
        }
    }


}
