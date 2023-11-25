package by.bsu.jimba.validations.serviceValidation.servicesImpl;

import by.bsu.jimba.domain.entities.Comment;
import by.bsu.jimba.domain.models.bindingModels.comment.CommentCreateBindingModel;
import by.bsu.jimba.validations.serviceValidation.services.CommentValidationService;
import org.springframework.stereotype.Component;

@Component
public class CommentValidationServiceImpl implements CommentValidationService {
    @Override
    public boolean isValid(Comment comment) {
        return comment != null;
    }

    @Override
    public boolean isValid(CommentCreateBindingModel commentCreateBindingModel) {
        return commentCreateBindingModel != null;
    }
}
