package lecture2.IO;

import lecture1.model.Calculator;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IOTest {

    @Test
    void createFile() throws IOException {
        IO io = new IO();
        String fileName = "text.txt";
        io.createFile(fileName);

        File file = new File(fileName);

        assertTrue(file.isFile());
    }

    @Test
    void writeToFile() throws IOException {
        IO io = new IO();
        Calculator calculator = new Calculator();
        calculator.plus(25.0);
        String fileName = "calculator";
        File file = new File(fileName);
        io.writeToFile(calculator, file);
    }

    @Test
    void readFromFile() throws IOException, ClassNotFoundException {
        IO io = new IO();
        String fileName = "calculator";
        File file = new File(fileName);
        Calculator calculator = (Calculator) io.readFromFile(file);
        assertEquals(25.0, calculator.getState());
    }
}