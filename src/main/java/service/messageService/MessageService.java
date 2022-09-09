package service.messageService;

import dto.UserDTO;
import entity.Message;

import java.sql.Date;

public interface MessageService {

    Message sendMessage(Integer id, String innerData, Date dateTime, Integer roomId);

    boolean deleteMessage(Integer id);
}
