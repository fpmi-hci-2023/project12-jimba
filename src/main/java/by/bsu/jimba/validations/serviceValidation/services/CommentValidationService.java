package by.bsu.jimba.validations.serviceValidation.services;


import by.bsu.jimba.domain.entities.Comment;
import by.bsu.jimba.domain.models.bindingModels.comment.CommentCreateBindingModel;

public interface CommentValidationService {
    boolean isValid(Comment comment);

    boolean isValid(CommentCreateBindingModel commentCreateBindingModel);
}
