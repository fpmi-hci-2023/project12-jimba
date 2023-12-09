package by.bsu.jimba.validations.serviceValidation.services.impl;

import org.junit.Before;
import org.junit.Test;

import by.bsu.jimba.domain.models.bindingModels.message.MessageCreateBindingModel;
import by.bsu.jimba.testUtils.MessagesUtils;
import by.bsu.jimba.validations.serviceValidation.services.MessageValidationService;
import by.bsu.jimba.validations.serviceValidation.servicesImpl.MessageValidationServiceImpl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MessageValidationServiceTests {
    private MessageValidationService messageValidationService;

    @Before
    public void setupTest(){
        messageValidationService = new MessageValidationServiceImpl();
    }

    @Test
    public void isValidWithMessageCreateBindingModel_whenValid_true(){
        MessageCreateBindingModel messageCreateBindingModel = MessagesUtils.getMessageCreateBindingModel();
        boolean result = messageValidationService.isValid(messageCreateBindingModel);
        assertTrue(result);
    }

    @Test
    public void isValidWithMessageCreateBindingModel_whenNull_false(){
        MessageCreateBindingModel messageCreateBindingModel =  null;
        boolean result = messageValidationService.isValid(messageCreateBindingModel);
        assertFalse(result);
    }

}
