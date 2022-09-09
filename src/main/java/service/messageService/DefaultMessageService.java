package service.messageService;

import dto.UserDTO;
import entity.Message;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repo.MessagesRepository;

import java.sql.Date;

@AllArgsConstructor
@Service
public class DefaultMessageService implements MessageService{

    private final MessagesRepository repository;

    @Override
    public Message sendMessage(Integer id, String innerData, Date dateTime, Integer roomId) {
        return repository.save(
                Message.builder().
                        id(id).
                        innerData(innerData).
                        date(dateTime).
                        roomId(roomId).build()
        );
    }

    @Override
    public boolean deleteMessage(Integer id) {
        var toDelete = repository.findMessageById(id);
        if (toDelete != null){
            repository.deleteById(id);
            return true;
        } else return false;
    }
}
