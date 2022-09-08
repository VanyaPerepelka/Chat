package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@Data
public class User {
    private int id;
    private String name;
    private String mail;
    private String password;
}
