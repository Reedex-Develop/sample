create table CAREER_DB (
    CAREER_ID int not null,
    MST_DB_ID int not null,
    constraint CAREER_DB_PK primary key(CAREER_ID, MST_DB_ID)
);
