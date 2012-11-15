alter table CAREER_LANG add constraint CAREER_LANG_FK1 foreign key (MST_LANG_ID) references MST_LANG (ID);
alter table CAREER_LANG add constraint CAREER_LANG_FK2 foreign key (CAREER_ID) references CAREER (ID);
