package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Just because I know about DTO and usefulness of this
 */
@Builder
@Data
public class UserDTO {

    private Integer id;

    private String name;

    private String email;

    private String password;
}
