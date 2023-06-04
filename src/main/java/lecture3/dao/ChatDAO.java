package lecture3.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import lecture3.model.Chat;

import java.io.*;

public class ChatDAO {
    private static String fileName = "chatHistory.txt";

    public static Chat getChat() {
        try {
            FileInputStream fis = new FileInputStream(new File(fileName));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Chat chat = (Chat) ois.readObject();
            ois.close();
            return chat;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveChat(Chat chat) {
        try {
            FileOutputStream fos = new FileOutputStream(new File(fileName));
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(chat);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
