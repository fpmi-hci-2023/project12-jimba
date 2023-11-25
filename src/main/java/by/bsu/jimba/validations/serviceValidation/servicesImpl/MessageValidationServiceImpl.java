package by.bsu.jimba.validations.serviceValidation.servicesImpl;

import by.bsu.jimba.domain.models.bindingModels.message.MessageCreateBindingModel;
import by.bsu.jimba.validations.serviceValidation.services.MessageValidationService;
import org.springframework.stereotype.Component;

@Component
public class MessageValidationServiceImpl implements MessageValidationService {

    @Override
    public boolean isValid(MessageCreateBindingModel messageCreateBindingModel) {
        return messageCreateBindingModel != null;
    }
}
