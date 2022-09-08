package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@Data
public class Room {
    private int id;
    private String name;
}
