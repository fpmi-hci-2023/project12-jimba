package by.bsu.jimba.validations.serviceValidation.services;


import by.bsu.jimba.domain.entities.UserRole;

public interface RoleValidationService {
    boolean isValid(UserRole role);
}
