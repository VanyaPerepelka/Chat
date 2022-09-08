package repo;

import entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface MessagesRepository extends JpaRepository<Message, Integer> {

    Message findMessageById(Integer id);

    Message findByDateTime(Integer fromUser, Integer toUser, Date datetime);

    Message findByText(Integer fromUser, Integer toUser, String innerData);

    Message findByRoom(Integer fromUser, Integer toUser);
}
