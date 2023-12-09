package by.bsu.jimba.validations.serviceValidation.services.impl;

import org.junit.Before;
import org.junit.Test;

import by.bsu.jimba.domain.entities.Like;
import by.bsu.jimba.domain.entities.Post;
import by.bsu.jimba.domain.entities.User;
import by.bsu.jimba.testUtils.LikesUtils;
import by.bsu.jimba.testUtils.PostsUtils;
import by.bsu.jimba.testUtils.UsersUtils;
import by.bsu.jimba.validations.serviceValidation.services.LikeValidationService;
import by.bsu.jimba.validations.serviceValidation.servicesImpl.LikeValidationServiceImpl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LikeValidationServiceTests {
    private LikeValidationService likeValidationService;

    @Before
    public void setupTest() {
        likeValidationService = new LikeValidationServiceImpl();
    }

    @Test
    public void isValid_whenValid_true() {
        User user = UsersUtils.createUser();
        Post post = PostsUtils.createPost(user, user);
        Like like = LikesUtils.createLike(user, post);

        boolean result = likeValidationService.isValid(like);
        assertTrue(result);
    }

    @Test
    public void isValid_whenNull_false() {
        Like like = null;
        boolean result = likeValidationService.isValid(like);
        assertFalse(result);
    }
}
