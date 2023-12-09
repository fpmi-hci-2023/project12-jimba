package by.bsu.jimba.validations.serviceValidation.services.impl;

import org.junit.Before;
import org.junit.Test;

import by.bsu.jimba.domain.entities.UserRole;
import by.bsu.jimba.testUtils.RolesUtils;
import by.bsu.jimba.validations.serviceValidation.services.RoleValidationService;
import by.bsu.jimba.validations.serviceValidation.servicesImpl.RoleValidationServiceImpl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RoleValidationServiceTests {
    private RoleValidationService roleValidationService;

    @Before
    public void setupTest(){
        roleValidationService = new RoleValidationServiceImpl();
    }

    @Test
    public void isValid_whenValid_true(){
        UserRole userRole = RolesUtils.createUserRole();
        boolean result = roleValidationService.isValid(userRole);
        assertTrue(result);
    }

    @Test
    public void isValid_whenNull_false(){
        UserRole userRole =  null;
        boolean result = roleValidationService.isValid(userRole);
        assertFalse(result);
    }
}
