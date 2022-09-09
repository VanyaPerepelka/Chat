package service.roomService;

import dto.UserDTO;
import entity.Room;

public interface RoomService {

    Room initChat(UserDTO user1,UserDTO user2, String name, Integer id);

    Room initNote(UserDTO userDTO, String name, Integer id);

    boolean deleteRoom(Integer roomId);

    boolean deleteRoom(String roomName);
}
