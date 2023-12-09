package by.bsu.jimba.validations.serviceValidation.servicesImpl;

import by.bsu.jimba.domain.entities.Relationship;
import by.bsu.jimba.validations.serviceValidation.services.RelationshipValidationService;
import org.springframework.stereotype.Component;

@Component
public class RelationshipValidationServiceImpl implements RelationshipValidationService {
    @Override
    public boolean isValid(Relationship relationship) {
        return relationship != null;
    }
}
