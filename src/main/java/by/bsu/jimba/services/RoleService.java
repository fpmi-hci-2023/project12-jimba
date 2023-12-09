package by.bsu.jimba.services;

import by.bsu.jimba.domain.entities.UserRole;

public interface RoleService {
    boolean persist(UserRole role) throws Exception;

    UserRole getByName(String name);
}
