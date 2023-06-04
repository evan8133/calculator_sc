package lecture3.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.io.Serializable;
import java.util.LinkedList;

@Data
public class Chat implements Serializable {
    private LinkedList<Message> history;
    private ObjectMapper mapper = new ObjectMapper();

    public Chat() {
        this.history = new LinkedList<>();
    }

    public void addMessage(Message message) {
        history.add(message);
    }

}
