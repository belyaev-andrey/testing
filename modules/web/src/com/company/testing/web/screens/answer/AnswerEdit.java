package com.company.testing.web.screens.answer;

import com.haulmont.cuba.gui.screen.*;
import com.company.testing.entity.Answer;

@UiController("testing_Answer.edit")
@UiDescriptor("answer-edit.xml")
@EditedEntityContainer("answerDc")
@LoadDataBeforeShow
public class AnswerEdit extends StandardEditor<Answer> {
}