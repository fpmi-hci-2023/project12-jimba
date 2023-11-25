package by.bsu.jimba.services;

import by.bsu.jimba.domain.models.bindingModels.message.MessageCreateBindingModel;
import by.bsu.jimba.domain.models.serviceModels.MessageServiceModel;
import by.bsu.jimba.domain.models.viewModels.message.MessageFriendsViewModel;

import java.util.List;

public interface MessageService {

    MessageServiceModel createMessage(MessageCreateBindingModel messageCreateBindingModel, String loggedInUsername) throws Exception;

    List<MessageServiceModel> getAllMessages(String loggedInUsername, String chatUserId);

    List<MessageFriendsViewModel> getAllFriendMessages(String loggedInUsername);
}
