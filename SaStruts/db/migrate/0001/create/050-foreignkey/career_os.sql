alter table CAREER_OS add constraint CAREER_OS_FK1 foreign key (MST_OS_ID) references MST_OS (ID);
alter table CAREER_OS add constraint CAREER_OS_FK2 foreign key (CAREER_ID) references CAREER (ID);
