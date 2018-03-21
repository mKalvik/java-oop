package Prax13.Board;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Board {

    private List<Message> boardMessages = new ArrayList<>();

    public void addMessageToBoard(Message message) {
        synchronized (boardMessages) {
            boardMessages.add(message);
            boardMessages.notifyAll();
        }
    }

    public Message getLastMessage() {
        return boardMessages.get(boardMessages.size() - 1);
    }

    public Message getMessageAfterTime(LocalDateTime lastLike) throws InterruptedException {
        synchronized (boardMessages){
            Optional<Message> message = Optional.empty();
            while (!message.isPresent()) {
                message = boardMessages.stream()
                        .filter(m -> m.getPostTime().isAfter(lastLike))
                        .findFirst();
                if (!message.isPresent()) {
                    boardMessages.wait();
                }
            }
            return message.get();
        }
    }
}
