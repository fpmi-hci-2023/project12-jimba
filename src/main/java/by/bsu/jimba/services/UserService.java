package by.bsu.jimba.services;

import by.bsu.jimba.domain.entities.User;
import by.bsu.jimba.domain.models.serviceModels.UserServiceModel;
import by.bsu.jimba.domain.models.viewModels.user.UserCreateViewModel;
import by.bsu.jimba.domain.models.viewModels.user.UserDetailsViewModel;
import by.bsu.jimba.domain.models.viewModels.user.UserEditViewModel;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    UserCreateViewModel createUser(UserServiceModel userRegisterBindingModel);

    boolean updateUser(UserServiceModel userUpdateBindingModel, String loggedInUserId) throws Exception;

    UserServiceModel updateUserOnlineStatus(String userName, boolean changeToOnline) throws Exception;

    UserDetailsViewModel getById(String id) throws Exception;

    UserEditViewModel editById(String id) throws Exception;

    User getByEmailValidation(String email);

    User getByUsernameValidation(String username);

    List<UserServiceModel> getAllUsers(String userId) throws Exception;

    boolean promoteUser(String id) throws Exception;

    boolean demoteUser(String id) throws Exception;

    boolean deleteUserById(String id) throws Exception;
}
