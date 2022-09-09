package repo;

import dto.UserDTO;
import entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoomsRepository extends JpaRepository<Room, Integer> {

    Room initRoom(UserDTO user1, UserDTO user2, Integer id);

    Room initRoom(UserDTO user, Integer id);

    Room findByName(String name);

}
