create table TESTING_QUESTION_AND_ANSWER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    QUESTION_ID varchar(36) not null,
    ANSWER_ID varchar(36) not null,
    CORRECT boolean not null,
    --
    primary key (ID)
);