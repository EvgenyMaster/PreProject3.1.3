package application.repositories;

import org.springframework.data.repository.CrudRepository;
import application.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
    void deleteById(Long id);
}

