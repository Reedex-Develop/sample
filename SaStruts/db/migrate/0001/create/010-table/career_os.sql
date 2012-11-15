create table CAREER_OS (
    CAREER_ID int not null,
    MST_OS_ID int not null,
    constraint CAREER_OS_PK primary key(CAREER_ID, MST_OS_ID)
);
