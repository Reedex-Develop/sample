alter table CAREER_MIDDLE add constraint CAREER_MIDDLE_FK1 foreign key (MST_MIDDLE_ID) references MST_MIDDLE (ID);
alter table CAREER_MIDDLE add constraint CAREER_MIDDLE_FK2 foreign key (CAREER_ID) references CAREER (ID);
