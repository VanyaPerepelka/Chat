package repo;

import entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoomsRepository extends JpaRepository<Room, Integer> {

    Room findByName(String name);

    Room findByRoomId(Integer id);
}
