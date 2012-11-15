create table STAFF (
    ID int not null auto_increment,
    NAME varchar(128),
    KANA varchar(128),
    SEX varchar(1),
    BIRTHDAY varchar(8),
    ZIP_CODE varchar(7),
    ADDRESS varchar(256),
    TEL varchar(32),
    STATION varchar(256),
    LAST_ACADEMIC_RECORD varchar(256),
    constraint STAFF_PK primary key(ID)
);
