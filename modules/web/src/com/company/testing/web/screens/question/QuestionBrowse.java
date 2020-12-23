package com.company.testing.web.screens.question;

import com.haulmont.cuba.gui.screen.*;
import com.company.testing.entity.Question;

@UiController("testing_Question.browse")
@UiDescriptor("question-browse.xml")
@LookupComponent("questionsTable")
@LoadDataBeforeShow
public class QuestionBrowse extends StandardLookup<Question> {
}