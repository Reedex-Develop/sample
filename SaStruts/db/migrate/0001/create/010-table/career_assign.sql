create table CAREER_ASSIGN (
    CAREER_ID int not null,
    MST_ASSIGN_ID int not null,
    constraint CAREER_ASSIGN_PK primary key(CAREER_ID, MST_ASSIGN_ID)
);
