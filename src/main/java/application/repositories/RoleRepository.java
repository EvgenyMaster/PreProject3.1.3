package application.repositories;

import org.springframework.data.repository.CrudRepository;
import application.models.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
