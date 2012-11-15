create table CAREER_ROLE (
    CAREER_ID int not null,
    MST_ROLE_ID int not null,
    constraint CAREER_ROLE_PK primary key(CAREER_ID, MST_ROLE_ID)
);
