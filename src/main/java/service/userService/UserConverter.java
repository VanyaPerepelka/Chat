package service.userService;

import dto.UserDTO;
import entity.User;

public class UserConverter {

    public UserDTO fromUserToUserDTO(User user){
        return UserDTO.builder().
                id(user.getId()).
                name(user.getName()).
                email(user.getMail()).
                password(user.getPassword()).
                build();
    }

    public User fromUserDTOtoUser(UserDTO userDTO){
        User res = new User();
        res.setId(userDTO.getId());
        res.setMail(userDTO.getEmail());
        res.setName(userDTO.getName());
        res.setPassword(userDTO.getPassword());
        return res;
    }
}


