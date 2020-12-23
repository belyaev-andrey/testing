package com.company.testing.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "TESTING_QUESTION")
@Entity(name = "testing_Question")
@NamePattern("%s|text")
public class Question extends StandardEntity {
    private static final long serialVersionUID = 8713475770956675455L;

    @NotNull
    @Column(name = "TEXT", nullable = false, length = 1024)
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}