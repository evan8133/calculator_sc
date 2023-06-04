package lecture2.IO;

import java.io.*;

public class IO {

    public void createFile(String fileName) throws IOException {
        File file = new File(fileName);
        file.createNewFile();
    }

    public void writeToFile(Object object, File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream ous = new ObjectOutputStream(fos);
        ous.writeObject(object);
    }

    public static Object readFromFile(File file) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object object = ois.readObject();
        ois.close();
        return object;
    }
}
