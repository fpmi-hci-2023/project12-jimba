package by.bsu.jimba.validations.serviceValidation.servicesImpl;

import by.bsu.jimba.domain.entities.Post;
import by.bsu.jimba.domain.models.bindingModels.post.PostCreateBindingModel;
import by.bsu.jimba.validations.serviceValidation.services.PostValidationService;
import org.springframework.stereotype.Component;

@Component
public class PostValidationServiceImpl implements PostValidationService {
    @Override
    public boolean isValid(Post post) {
        return post != null;
    }

    @Override
    public boolean isValid(PostCreateBindingModel postCreateBindingModel) {
        return postCreateBindingModel != null;
    }
}
