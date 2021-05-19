package web.dao.role;

import web.model.Role;
import web.model.User;

import java.util.Optional;

public interface RoleDao {
    void create(String nameRole, User user);
    Role getRole(String name);
}
