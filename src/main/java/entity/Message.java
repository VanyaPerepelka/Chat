package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import java.sql.Date;

@AllArgsConstructor
@Entity
@Data
public class Message {
    private int id;
    private int fromUser;
    private int toUser;
    private String innerData;
    private Date date;
}
