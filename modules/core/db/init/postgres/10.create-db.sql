-- begin TESTING_TEST
create table TESTING_TEST (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end TESTING_TEST
-- begin TESTING_ANSWER
create table TESTING_ANSWER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TEXT varchar(255) not null,
    --
    primary key (ID)
)^
-- end TESTING_ANSWER
-- begin TESTING_QUESTION_AND_ANSWER
create table TESTING_QUESTION_AND_ANSWER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    QUESTION_ID uuid not null,
    ANSWER_ID uuid not null,
    CORRECT boolean not null,
    --
    primary key (ID)
)^
-- end TESTING_QUESTION_AND_ANSWER
-- begin TESTING_QUESTION
create table TESTING_QUESTION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TEXT varchar(1024) not null,
    --
    primary key (ID)
)^
-- end TESTING_QUESTION
