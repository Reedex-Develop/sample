alter table CAREER_DB add constraint CAREER_DB_FK1 foreign key (MST_DB_ID) references MST_DB (ID);
alter table CAREER_DB add constraint CAREER_DB_FK2 foreign key (CAREER_ID) references CAREER (ID);
