package com.company.testing.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "TESTING_ANSWER")
@Entity(name = "testing_Answer")
@NamePattern("%s|text")
public class Answer extends StandardEntity {
    private static final long serialVersionUID = 6787457294455784539L;

    @NotNull
    @Column(name = "TEXT", nullable = false)
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}