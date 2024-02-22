package am.itspace.eshop_spring.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class SpringUser extends User {
    private am.itspace.eshop_spring.entity.User user;

    public SpringUser(am.itspace.eshop_spring.entity.User user) {
        super(user.getEmail(), user.getPassword(),
                user.isActive(),true,true,true,
                AuthorityUtils.createAuthorityList(user.getUserType().name()));
        this.user = user;
    }

    public am.itspace.eshop_spring.entity.User  getUser() {
        return user;
    }
}