package by.bsu.jimba.services.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import by.bsu.jimba.domain.entities.UserRole;
import by.bsu.jimba.repositories.RoleRepository;
import by.bsu.jimba.services.RoleService;
import by.bsu.jimba.validations.serviceValidation.services.RoleValidationService;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class RoleServiceTests {

    @Autowired
    private RoleService roleService;

    @MockBean
    private RoleRepository mockRoleRepository;

    @MockBean
    private RoleValidationService mockRoleValidation;

    @Test
    public void persist_whenUserRoleIsValid_createRole() throws Exception {
        UserRole role = new UserRole();

        when(mockRoleValidation.isValid(any())).thenReturn(true);

        roleService.persist(role);

        verify(mockRoleRepository).save(role);
        verify(mockRoleRepository, times(1)).save(role);
    }

    @Test(expected = Exception.class)
    public void persist_whenUserRoleIsNotValid_throwException() throws Exception {
        when(mockRoleValidation.isValid(any())).thenReturn(false);

        roleService.persist(null);
    }

    @Test
    public void getByName_whenUserRoleNameIsValid_getRoleByName() throws Exception {
        // Arrange
        UserRole role = new UserRole();
        role.setId("5");
        role.setAuthority("TEST");

        when(mockRoleRepository.findByAuthority("TEST")).thenReturn(role);

        // Act
        UserRole testRole = roleService.getByName("TEST");

        // Assert
        assertNotNull(testRole);
        assertEquals(testRole.getId(), "5");
        assertEquals(testRole.getAuthority(), "TEST");

        verify(mockRoleRepository).findByAuthority("TEST");
        verify(mockRoleRepository, times(1)).findByAuthority("TEST");
    }

    @Test
    public void getByName_whenUserRoleNameIsNotValid_returnNull() throws Exception {
        when(mockRoleRepository.findByAuthority("invalid_name")).thenReturn(null);

        // Act
        UserRole testRole = roleService.getByName("invalid_name");

        // Assert
        assertNull(testRole);

        verify(mockRoleRepository).findByAuthority("invalid_name");
        verify(mockRoleRepository, times(1)).findByAuthority("invalid_name");
    }
}