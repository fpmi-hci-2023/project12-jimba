package by.bsu.jimba.validations.serviceValidation.services;


import by.bsu.jimba.domain.entities.Post;
import by.bsu.jimba.domain.models.bindingModels.post.PostCreateBindingModel;

public interface PostValidationService {
    boolean isValid(Post post);

    boolean isValid(PostCreateBindingModel postCreateBindingModel);
}
