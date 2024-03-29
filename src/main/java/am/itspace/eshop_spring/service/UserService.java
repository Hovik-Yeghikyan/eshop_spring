package am.itspace.eshop_spring.service;

import am.itspace.eshop_spring.entity.User;

import java.util.List;

public interface UserService {

   User save(User user);
   User register(User user);

   List<User> findAll();

   User findByEmail(String email);
   User findByToken(String token);
}
