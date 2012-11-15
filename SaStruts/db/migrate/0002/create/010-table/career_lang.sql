create table CAREER_LANG (
    CAREER_ID int not null,
    MST_LANG_ID int not null,
    constraint CAREER_LANG_PK primary key(CAREER_ID, MST_LANG_ID)
);
