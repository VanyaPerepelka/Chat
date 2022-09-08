package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MessageDTO {

    private Integer id;

    private Integer fromUser;

    private Integer toUser;

    private String innerData;

    private Date dateTime;
}
