package am.itspace.eshop_spring.repository;

import am.itspace.eshop_spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

   Optional<User> findByEmail(String email);
   Optional<User> findByToken(String token);

   List<User> findAllByActive(boolean active);
}
