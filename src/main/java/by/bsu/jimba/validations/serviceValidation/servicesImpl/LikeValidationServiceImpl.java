package by.bsu.jimba.validations.serviceValidation.servicesImpl;

import by.bsu.jimba.domain.entities.Like;
import by.bsu.jimba.validations.serviceValidation.services.LikeValidationService;
import org.springframework.stereotype.Component;

@Component
public class LikeValidationServiceImpl implements LikeValidationService {
    @Override
    public boolean isValid(Like like) {
        return like != null;
    }
}
