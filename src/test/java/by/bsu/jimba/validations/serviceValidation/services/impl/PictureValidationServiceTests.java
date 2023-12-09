package by.bsu.jimba.validations.serviceValidation.services.impl;

import org.junit.Before;
import org.junit.Test;

import by.bsu.jimba.domain.entities.Picture;
import by.bsu.jimba.domain.entities.User;
import by.bsu.jimba.testUtils.PictureUtils;
import by.bsu.jimba.testUtils.UsersUtils;
import by.bsu.jimba.validations.serviceValidation.services.PictureValidationService;
import by.bsu.jimba.validations.serviceValidation.servicesImpl.PictureValidationServiceImpl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PictureValidationServiceTests {
    private PictureValidationService pictureValidationService;

    @Before
    public void setupTest() {
        pictureValidationService = new PictureValidationServiceImpl();
    }

    @Test
    public void isValid_whenValid_true() {
        User user = UsersUtils.createUser();
        Picture picture = PictureUtils.createPicture(user);

        boolean result = pictureValidationService.isValid(picture);
        assertTrue(result);
    }

    @Test
    public void isValid_whenNull_false() {
        Picture picture = null;
        boolean result = pictureValidationService.isValid(picture);
        assertFalse(result);
    }
}
