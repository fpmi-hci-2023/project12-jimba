package by.bsu.jimba.validations.serviceValidation.services;


import by.bsu.jimba.domain.models.bindingModels.message.MessageCreateBindingModel;

public interface MessageValidationService {
    boolean isValid(MessageCreateBindingModel messageCreateBindingModel);
}
