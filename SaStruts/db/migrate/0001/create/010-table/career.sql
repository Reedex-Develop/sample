create table CAREER (
    ID int not null auto_increment,
    STAFF_ID int not null,
    NAME varchar(128),
    CUSTOMER varchar(128),
    SUMMARY varchar(4096),
    PROJECT_MEMBERS int,
    TEAM_MEMBERS int,
    START_YM varchar(6),
    END_YM varchar(6),
    constraint CAREER_PK primary key(ID)
);
