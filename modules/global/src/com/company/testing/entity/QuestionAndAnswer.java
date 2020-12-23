package com.company.testing.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "TESTING_QUESTION_AND_ANSWER")
@Entity(name = "testing_QuestionAndAnswer")
public class QuestionAndAnswer extends StandardEntity {
    private static final long serialVersionUID = 925521196255062832L;

    @Lookup(type = LookupType.DROPDOWN, actions = {})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "QUESTION_ID")
    private Question question;

    @Lookup(type = LookupType.DROPDOWN, actions = {})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANSWER_ID")
    private Answer answer;

    @NotNull
    @Column(name = "CORRECT", nullable = false)
    private Boolean correct = false;

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}