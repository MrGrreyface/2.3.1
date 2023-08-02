package sprhib.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sprhib.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
