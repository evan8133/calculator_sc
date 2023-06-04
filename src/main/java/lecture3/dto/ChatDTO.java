package lecture3.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lecture3.model.Chat;
import lecture3.model.Message;
import lombok.Data;

import java.util.List;

@Data
public class ChatDTO {
    @JsonIgnore
    private final int pageSize = 10;

    private List<Message> messages;

    public ChatDTO(Chat chat, int page)
    {
        this.messages = chat.getHistory().subList(page * pageSize, (page + 1) * pageSize);
    }

    public ChatDTO(Chat chat)
    {
        this.messages = chat.getHistory();
    }
}
