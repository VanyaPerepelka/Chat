package service.userService;

import dto.UserDTO;
import service.exception.ValidationException;

import java.util.List;

public interface UserService {

    UserDTO saveUser(UserDTO userDTO) throws ValidationException;

    boolean deleteUser(Integer userId);

    UserDTO findByEmail(String email) throws ValidationException;

    List<UserDTO> findAll();
}
