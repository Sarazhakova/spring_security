package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.RoleDAO;
import web.model.Role;

import java.util.List;

public class RoleServiceImpl implements RoleService{
    private final RoleDAO roleDAO;

    @Autowired
    RoleServiceImpl(RoleDAO roleDAO){
        this.roleDAO = roleDAO;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleDAO.getAllRoles();
    }

    @Override
    public void addRole(Role role) {
        roleDAO.addRole(role);
    }

    @Override
    public Role getById(long id) {
        return roleDAO.getById(id);
    }

    @Override
    public void removeById(long id) {
        roleDAO.removeById(id);
    }
}
