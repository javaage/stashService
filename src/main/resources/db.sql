drop table PUBLIC.T001_ROLE CASCADE ;



drop table PUBLIC.T004_SETTING CASCADE ;

drop table PUBLIC.T005_LOG CASCADE ;

drop table T006_REGION CASCADE ;

drop table PUBLIC.T002_USER CASCADE ;

drop table PUBLIC.T003_BOOKING CASCADE ;

/*==============================================================*/
/* User: PUBLIC                                                 */
/*==============================================================*/
/*==============================================================*/
/* Table: T001_ROLE                                             */
/*==============================================================*/
create table PUBLIC.T001_ROLE (
   N_ROLE_ID            SERIAL                not null,
   C_ROLE_NAME          varchar              not null,
   D_CREATED_DATE       timestamp            not null,
   C_CREATED_OPERATOR   varchar              not null,
   D_LAST_MODIFY_DATE   timestamp            not null,
   C_LAST_MODIFY_OPERATOR varchar            not null,
   constraint PK_T001_ROLE primary key (N_ROLE_ID)
);

/*==============================================================*/
/* Table: T002_USER                                             */
/*==============================================================*/
create table PUBLIC.T002_USER (
   C_USER_ID            varchar              not null,
   C_UAA_ID        varchar         not null,
   N_ACTIVE        int           not null,
   N_ROLE_ID            int                  not null,
   N_REGION_ID          int                  not null,
   D_CREATED_DATE       timestamp            not null,
   C_CREATED_OPERATOR   varchar              not null,
   D_LAST_MODIFY_DATE   timestamp            not null,
   C_LAST_MODIFY_OPERATOR varchar            not null,
   C_EMAIL              varchar              null,
   C_ORGANIZATION       varchar              null,
   C_NAME               varchar              null,
   C_CONTACT      varchar         null,
   C_PHONE_NO           varchar              null,
   C_BUYER_RELATION    varchar         null,
   C_BUYER_PERSON    varchar         null,
   C_BUYER_PHONE    varchar         null,
   C_REGION_GROUP 	varchar			null,
   c_goods_helper	varchar			null,
   c_forwarding		text			null,
   constraint PK_T002_USER primary key (C_USER_ID)
);

/*==============================================================*/
/* Table: T003_BOOKING                                          */
/*==============================================================*/
create table PUBLIC.T003_BOOKING (
   N_BOOKING_ID         SERIAL          not null,
   C_USER_ID            varchar              not null,
   N_REGION_ID          int                  not null,
   C_ASN_N0             varchar              not null,
   N_QUANTITY           int                  not null,
   D_START_TIME         timestamp            not null,
   D_END_TIME           timestamp            not null,
   N_STATUS             int                  not null,
   D_CREATED_DATE       timestamp            not null,
   C_CREATED_OPERATOR   varchar              not null,
   D_LAST_MODIFY_DATE   timestamp            not null,
   C_LAST_MODIFY_OPERATOR varchar            not null,
   N_DOCK_ID      int           not null,
   C_PO_NO              varchar              null,
   C_PART_NO            varchar              null,
   C_AWB                varchar              null,
   C_RATE               varchar              null,
   C_RECEIVER           varchar              null,
   D_RECEIVE_DATE       timestamp            null,
   C_EXCEPTION          varchar              null,
   C_COMMENT            varchar              null,
   C_DELIVERY_STATUS  varchar         null,
   c_delivery_detail  varchar         null,
   c_abnormal      varchar         null,
   c_abnormal_detail  varchar         null,
   D_ENTER_TIME 	timestamp 		null,
   D_EXIT_TIME 		timestamp 		null,
   C_ENTER_OPERATOR varchar 		null,
   C_EXIT_OPERATOR varchar 			null,
   N_BOOKING_IDENTIFIER bigint not null default (extract(year from now())*100000000 + extract(month from now())*1000000 + extract(day  from now())*10000 + nextval('t003_booking_identifier_seq')),
   c_forwarding 	text 			null,
   C_ASSIGN_ID 		varchar 		NOT NULL DEFAULT '',
   constraint PK_T003_BOOKING primary key (N_BOOKING_ID)
);

alter table t003_booking add column D_ENTER_TIME timestamp null;
alter table t003_booking add column D_EXIT_TIME timestamp null;
alter table t003_booking add column C_ENTER_OPERATOR varchar null;
alter table t003_booking add column C_EXIT_OPERATOR varchar null;

/*==============================================================*/
/* Table: T004_SETTING                                          */
/*==============================================================*/
create table PUBLIC.T004_SETTING (
   N_SETTING_ID         SERIAL          not null,
   C_KEY                varchar              not null,
   C_VALUE              text                 not null,
   D_CREATED_DATE       timestamp            not null,
   C_CREATED_OPERATOR   varchar              not null,
   D_LAST_MODIFY_DATE   timestamp            not null,
   C_LAST_MODIFY_OPERATOR varchar            not null,
   constraint PK_T004_SETTING primary key (N_SETTING_ID)
);

/*==============================================================*/
/* Table: T005_LOG                                              */
/*==============================================================*/
create table PUBLIC.T005_LOG (
   N_LOG_ID             SERIAL          not null,
   C_USER_ID            varchar              not null,
   C_LOG                varchar              not null,
   D_LOG_DATE           timestamp            not null,
   N_BOOKING_ID         int                  not null,
   D_CREATED_DATE       timestamp            not null,
   C_CREATED_OPERATOR   varchar              not null,
   D_LAST_MODIFY_DATE   timestamp            not null,
   C_LAST_MODIFY_OPERATOR varchar            not null,
   constraint PK_T005_LOG primary key (N_LOG_ID)
);

/*==============================================================*/
/* Table: T006_REGION                                           */
/*==============================================================*/
create table T006_REGION (
   N_REGION_ID          SERIAL               not null,
   C_REGION             varchar              not null,
   C_LOCATION_CODE      varchar              not null,
   C_REGION_NAME 		varchar 				null,
   N_STATUS             int                  not null,
   C_IMAGE_DATA 		varchar 			 not null default '',
   constraint PK_T006_REGION primary key (N_REGION_ID)
);

drop table T007_RELATION;

/*==============================================================*/
/* Table: T007_RELATION                                         */
/*==============================================================*/
create table T007_RELATION (
   C_USER_ID            varchar              not null,
   N_REGION_ID          SERIAL               not null,
   C_CONTACT            varchar              null,
   C_BUYER_RELATION     varchar              null,
   C_BUYER_PERSON       varchar              null,
   C_BUYER_PHONE        varchar              null,
   D_CREATED_DATE       timestamp            null,
   C_CREATED_OPERATOR   varchar              null,
   D_LAST_MODIFY_DATE   timestamp            null,
   C_LAST_MODIFY_OPERATOR varchar            null,
   c_forwarding 		text 				null
);

  insert into t007_relation(c_user_id, n_region_id, c_contact, c_buyer_relation, c_buyer_person, 
       c_buyer_phone, d_created_date, c_created_operator, d_last_modify_date, 
       c_last_modify_operator) 
  SELECT c_user_id, n_region_id, c_contact, c_buyer_relation, c_buyer_person, 
       c_buyer_phone, d_created_date, c_created_operator, d_last_modify_date, 
       c_last_modify_operator 
  FROM public.t002_user where n_role_id=3

alter table T002_USER
   add constraint FK_T002_USE_REFERENCE_T001_ROL foreign key (N_ROLE_ID)
      references T001_ROLE (N_ROLE_ID)
      on delete restrict on update restrict;

alter table T002_USER
   add constraint FK_T002_USE_REFERENCE_T006_REGION foreign key (N_REGION_ID)
      references T006_REGION (N_REGION_ID)
      on delete restrict on update restrict;

alter table T003_BOOKING
   add constraint FK_T003_BOO_REFERENCE_T002_USE foreign key (C_USER_ID)
      references T002_USER (C_USER_ID)
      on delete restrict on update restrict;

alter table T005_LOG
   add constraint FK_T005_LOG_REFERENCE_T002_USE foreign key (C_USER_ID)
      references T002_USER (C_USER_ID)
      on delete restrict on update restrict;

alter table T005_LOG
   add constraint FK_T005_LOG_REFERENCE_T003_BOO foreign key (N_BOOKING_ID)
      references T003_BOOKING (N_BOOKING_ID)
      on delete restrict on update restrict;
      
 
CREATE OR REPLACE FUNCTION "public"."order_dock"(d_time varchar,max_count int,region_id int)  
  RETURNS integer AS
  $BODY$
  DECLARE   
    select_result record;
    order_num int;
    dock_id int;
    e_time timestamp;
BEGIN
  update t003_booking set n_dock_id = 0 where to_char(d_start_time,'YYYY-MM-DD')=d_time and n_region_id=region_id and n_status=1;

        for select_result in   
    select n_booking_id,d_start_time,d_end_time from t003_booking where n_dock_id = 0 order by (d_end_time-d_start_time) desc, d_start_time asc
  loop
    select a.n_dock_id into dock_id from
    (select min(case when select_result.d_start_time>=d_end_time then select_result.d_start_time-d_end_time else d_start_time-select_result.d_end_time end ) as delta,n_dock_id from t003_booking
    where to_char(d_start_time,'YYYY-MM-DD') = d_time and n_status=1 AND n_region_id=region_id and n_dock_id not in
    (select distinct n_dock_id from t003_booking where not (d_end_time <= select_result.d_start_time or d_start_time >= select_result.d_end_time) AND n_status=1 AND n_region_id=region_id)
    group by n_dock_id order by delta limit 1) a;

    if dock_id>0 and dock_id<=max_count then
      update t003_booking set n_dock_id = dock_id where n_booking_id = select_result.n_booking_id;
    else
      for i in 1 .. max_count
      loop
        if i not in (select distinct n_dock_id from t003_booking where to_char(d_start_time,'YYYY-MM-DD')=d_time and n_region_id=region_id and n_status=1) then
          update t003_booking set n_dock_id = i where n_booking_id = select_result.n_booking_id;
        end if;
      end loop;
    end if;
  end loop;
  if not exists (select * from t003_booking where n_dock_id = 0 and to_char(d_start_time,'YYYY-MM-DD')=d_time and n_region_id=region_id and n_status=1) then
    return 1;
  else
    return -1;
  end if;
END
  
$BODY$  
  LANGUAGE 'plpgsql' VOLATILE COST 100
;


create SEQUENCE public.t003_booking_identifier_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9999
  cycle
  START 1
  CACHE 1;
ALTER TABLE public.t003_booking_identifier_seq
  OWNER TO postgres;



