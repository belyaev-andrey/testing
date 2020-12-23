package com.company.testing.web.screens.question;

import com.haulmont.cuba.gui.screen.*;
import com.company.testing.entity.Question;

@UiController("testing_Question.edit")
@UiDescriptor("question-edit.xml")
@EditedEntityContainer("questionDc")
@LoadDataBeforeShow
public class QuestionEdit extends StandardEditor<Question> {
}