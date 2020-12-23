package com.company.testing.web.screens.questionandanswer;

import com.haulmont.cuba.gui.screen.*;
import com.company.testing.entity.QuestionAndAnswer;

@UiController("testing_QuestionAndAnswer.edit")
@UiDescriptor("question-and-answer-edit.xml")
@EditedEntityContainer("questionAndAnswerDc")
@LoadDataBeforeShow
public class QuestionAndAnswerEdit extends StandardEditor<QuestionAndAnswer> {
}