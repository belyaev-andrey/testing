package com.company.testing.web.screens.questionandanswer;

import com.haulmont.cuba.gui.screen.*;
import com.company.testing.entity.QuestionAndAnswer;

@UiController("testing_QuestionAndAnswer.browse")
@UiDescriptor("question-and-answer-browse.xml")
@LookupComponent("questionAndAnswersTable")
@LoadDataBeforeShow
public class QuestionAndAnswerBrowse extends StandardLookup<QuestionAndAnswer> {
}