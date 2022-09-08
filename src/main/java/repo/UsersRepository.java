package repo;

import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {

    User findByEmail(String login);

    User findByName(String name);
}
