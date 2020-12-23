package com.company.testing.core.role;

import com.company.testing.entity.Answer;
import com.company.testing.entity.Question;
import com.company.testing.entity.QuestionAndAnswer;
import com.company.testing.entity.Test;
import com.haulmont.cuba.security.app.role.AnnotatedRoleDefinition;
import com.haulmont.cuba.security.app.role.annotation.EntityAccess;
import com.haulmont.cuba.security.app.role.annotation.EntityAttributeAccess;
import com.haulmont.cuba.security.app.role.annotation.Role;
import com.haulmont.cuba.security.entity.*;
import com.haulmont.cuba.security.role.EntityAttributePermissionsContainer;
import com.haulmont.cuba.security.role.EntityPermissionsContainer;

@Role(name = EntitiesAllRestRole.NAME, securityScope = "REST")
public class EntitiesAllRestRole extends AnnotatedRoleDefinition {
    public final static String NAME = "rest-entities-all";

    @EntityAccess(entityClass = UserSessionEntity.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @EntityAccess(entityClass = UserSubstitution.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @EntityAccess(entityClass = UserSetting.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @EntityAccess(entityClass = UserRole.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @EntityAccess(entityClass = User.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @EntityAccess(entityClass = com.haulmont.cuba.security.entity.Role.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @EntityAccess(entityClass = Question.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @EntityAccess(entityClass = QuestionAndAnswer.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @EntityAccess(entityClass = Test.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @EntityAccess(entityClass = Answer.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @Override
    public EntityPermissionsContainer entityPermissions() {
        return super.entityPermissions();
    }

    @EntityAttributeAccess(entityClass = UserSessionEntity.class, modify = "*")
    @EntityAttributeAccess(entityClass = UserSubstitution.class, modify = "*")
    @EntityAttributeAccess(entityClass = UserSetting.class, modify = "*")
    @EntityAttributeAccess(entityClass = UserRole.class, modify = "*")
    @EntityAttributeAccess(entityClass = User.class, modify = "*")
    @EntityAttributeAccess(entityClass = com.haulmont.cuba.security.entity.Role.class, modify = "*")
    @EntityAttributeAccess(entityClass = Question.class, modify = "*")
    @EntityAttributeAccess(entityClass = QuestionAndAnswer.class, modify = "*")
    @EntityAttributeAccess(entityClass = Test.class, modify = "*")
    @EntityAttributeAccess(entityClass = Answer.class, modify = "*")
    @Override
    public EntityAttributePermissionsContainer entityAttributePermissions() {
        return super.entityAttributePermissions();
    }
}