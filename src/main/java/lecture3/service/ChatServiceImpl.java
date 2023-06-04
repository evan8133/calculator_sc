package lecture3.service;

import lecture3.dao.ChatDAO;
import lecture3.dto.ChatDTO;
import lecture3.model.Chat;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {
    @Override
    public ChatDTO getActualChat() {
        Chat chat = ChatDAO.getChat();
        assert chat != null;
        ChatDTO chatDTO = new ChatDTO(chat);
        return chatDTO;
    }
}
