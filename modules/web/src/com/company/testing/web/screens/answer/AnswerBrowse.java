package com.company.testing.web.screens.answer;

import com.haulmont.cuba.gui.screen.*;
import com.company.testing.entity.Answer;

@UiController("testing_Answer.browse")
@UiDescriptor("answer-browse.xml")
@LookupComponent("answersTable")
@LoadDataBeforeShow
public class AnswerBrowse extends StandardLookup<Answer> {
}