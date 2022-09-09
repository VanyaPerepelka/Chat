package service.roomService;

import dto.UserDTO;
import entity.Room;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repo.RoomsRepository;


@AllArgsConstructor
@Service
public class DefaultRoomService implements RoomService{

    private final RoomsRepository roomsRepository;

    @Override
    public Room initChat(UserDTO user1, UserDTO user2, String name, Integer id){
        Room newRoom;
        if (user1 == null && user2 != null){
           newRoom = initNote(user2, name, id);

        } else if (user2 == null && user1 != null){
            newRoom = initNote(user1, name, id);

        } else if (user1 != null && user2 != null){
            newRoom = roomsRepository.save(
                    Room.builder().
                            id(id).
                            name(name).
                            user2Id(user2.getId()).
                            user2Id(user2.getId()).build());
        } else {
            return null;
        }
        return newRoom;
    }

    @Override
    public Room initNote(UserDTO userDTO, String name, Integer id) {
        return roomsRepository.save(
                Room.builder().
                        id(id).
                        name(name).
                        user2Id(userDTO.getId()).build());
    }

    @Override
    public boolean deleteRoom(Integer roomId) {
        var toDelete = roomsRepository.findById(roomId);
        if (toDelete.isPresent()){
            roomsRepository.deleteById(roomId);
            return true;
        } else return false;
    }

    @Override
    public boolean deleteRoom(String roomName) {
        var toDelete = roomsRepository.findByName(roomName);
        if (toDelete != null){
            roomsRepository.delete(toDelete);
            return true;
        } else return false;
    }

}
