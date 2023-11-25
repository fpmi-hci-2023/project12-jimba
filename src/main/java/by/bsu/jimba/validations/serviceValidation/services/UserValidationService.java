package by.bsu.jimba.validations.serviceValidation.services;

import by.bsu.jimba.domain.entities.User;
import by.bsu.jimba.domain.models.bindingModels.user.UserRegisterBindingModel;
import by.bsu.jimba.domain.models.bindingModels.user.UserUpdateBindingModel;
import by.bsu.jimba.domain.models.serviceModels.UserServiceModel;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserValidationService {
    boolean isValid(User user);

    boolean isValid(UserServiceModel userServiceModel);

    boolean isValid(UserRegisterBindingModel userRegisterBindingModel);

    boolean isValid(String firstParam, String secondParam);

    boolean isValid(UserUpdateBindingModel userUpdateBindingModel);

    boolean isValid(UserDetails userData);
}
