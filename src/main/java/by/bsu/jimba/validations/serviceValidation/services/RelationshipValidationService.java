package by.bsu.jimba.validations.serviceValidation.services;


import by.bsu.jimba.domain.entities.Relationship;

public interface RelationshipValidationService {
    boolean isValid(Relationship relationship);
}
