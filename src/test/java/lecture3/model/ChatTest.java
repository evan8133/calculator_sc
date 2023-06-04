package lecture3.model;

import lecture3.dao.ChatDAO;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ChatTest {

    @Test
    public void createChat()
    {
        Chat chat = new Chat();
        ChatDAO.saveChat(chat);
        assertEquals(chat.getHistory().size(), ChatDAO.getChat().getHistory().size());
    }

    @Test
    public void testAddToChat() {
        Chat chat = ChatDAO.getChat();
        assert chat != null;
        chat.addMessage(new Message("test", "test", LocalDateTime.now(), null));
        ChatDAO.saveChat(chat);
    }

}