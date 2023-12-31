package by.bsu.jimba.validations.serviceValidation.services.impl;

import org.junit.Before;
import org.junit.Test;

import by.bsu.jimba.domain.entities.Post;
import by.bsu.jimba.domain.entities.User;
import by.bsu.jimba.domain.models.bindingModels.post.PostCreateBindingModel;
import by.bsu.jimba.testUtils.PostsUtils;
import by.bsu.jimba.testUtils.UsersUtils;
import by.bsu.jimba.validations.serviceValidation.services.PostValidationService;
import by.bsu.jimba.validations.serviceValidation.servicesImpl.PostValidationServiceImpl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PostValidationServiceTests {
    private PostValidationService postValidationService;

    @Before
    public void setupTest(){
        postValidationService = new PostValidationServiceImpl();
    }

    @Test
    public void isValidWithPost_whenValid_true(){
        User user = UsersUtils.createUser();
        Post post = PostsUtils.createPost(user, user);

        boolean result = postValidationService.isValid(post);
        assertTrue(result);
    }

    @Test
    public void isValidWithPost_whenNull_false(){
        Post post =  null;
        boolean result = postValidationService.isValid(post);
        assertFalse(result);
    }

    @Test
    public void isValidWithPostCreateBindingModel_whenValid_true(){
        PostCreateBindingModel postCreateBindingModel = PostsUtils.getPostCreateBindingModels(1).get(0);
        boolean result = postValidationService.isValid(postCreateBindingModel);
        assertTrue(result);
    }

    @Test
    public void isValidWithPostCreateBindingModel_whenNull_false(){
        PostCreateBindingModel postCreateBindingModel =   null;
        boolean result = postValidationService.isValid(postCreateBindingModel);
        assertFalse(result);
    }
}
