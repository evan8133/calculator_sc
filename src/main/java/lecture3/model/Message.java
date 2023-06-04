package lecture3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message implements Serializable {
    private String text;
    private String author;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
