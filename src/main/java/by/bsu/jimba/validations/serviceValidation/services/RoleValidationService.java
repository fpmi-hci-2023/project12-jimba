package by.bsu.jimba.validations.serviceValidation.services;

import kl.socialnetwork.domain.entities.UserRole;

public interface RoleValidationService {
    boolean isValid(UserRole role);
}
