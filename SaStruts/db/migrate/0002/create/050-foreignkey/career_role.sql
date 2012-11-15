alter table CAREER_ROLE add constraint CAREER_ROLE_FK1 foreign key (MST_ROLE_ID) references MST_ROLE (ID);
alter table CAREER_ROLE add constraint CAREER_ROLE_FK2 foreign key (CAREER_ID) references CAREER (ID);
