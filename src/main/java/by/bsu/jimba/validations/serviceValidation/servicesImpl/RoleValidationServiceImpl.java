package by.bsu.jimba.validations.serviceValidation.servicesImpl;

import by.bsu.jimba.domain.entities.UserRole;
import by.bsu.jimba.validations.serviceValidation.services.RoleValidationService;
import org.springframework.stereotype.Component;

@Component
public class RoleValidationServiceImpl implements RoleValidationService {
    @Override
    public boolean isValid(UserRole role) {
        return role != null;
    }
}
