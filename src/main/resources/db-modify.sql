INSERT INTO T001_ROLE(
N_ROLE_ID,
C_ROLE_NAME,
D_CREATED_DATE,
C_CREATED_OPERATOR,
D_LAST_MODIFY_DATE,
C_LAST_MODIFY_OPERATOR  
) VALUES(
  1,'admin',now(),'system',now(),'system'
),(
  2,'warehouse',now(),'system',now(),'system'
),(
  3,'user',now(),'system',now(),'system'
),(
  4,'superAdmin',now(),'system',now(),'system'
),(
  5,'guard',now(),'system',now(),'system'
);

INSERT INTO t006_region(
  n_region_id, c_region, c_location_code)
  VALUES (1, 'Tianjin', 'zh-cn'),
  (2, 'Wuxi', 'zh-cn'),
  (3, 'Hino', 'jp');

INSERT INTO t006_region(
   c_region, c_location_code,c_region_name,n_status)
  VALUES ( 'Beijing', 'zh-cn','北京工厂',1)  
  
INSERT INTO t002_user(
  c_user_id, c_uaa_id, n_active, c_phone_no, c_email, n_role_id, c_organization, c_name, n_region_id, d_created_date, c_created_operator, d_last_modify_date, c_last_modify_operator)
  VALUES
  ('SuperAdmin', '',1, '18842666017', 'yu.ren@pactera.com', 4, 'Super Admin', 'SuperAdmin', 1, now(), 'system', now(), 'system'),
  ('502673367', '',1, '13624914663', 'subing.xiao@pactera.com', 3, 'BEIJING BINYUAN', '502673367', 1, now(), 'system', now(), 'system'),
  ('502673368', '',1, '13624914663', 'subing.xiao@pactera.com', 3, 'SUZHOU TIANYE', '502673368', 1, now(), 'system', now(), 'system'),
  ('AdminTianjin', '',1, '18842666017', 'yu.ren@pactera.com', 1, 'Admin Tianjin', 'AdminTianjin', 1, now(), 'system', now(), 'system'),
  ('WarehouseTianjin', '',1, '13998421799', 'gary.liu@pactera.com', 2, 'Warehouse Tianjin', 'WarehouseTianjin', 1, now(), 'system', now(), 'system'),
  ('502673369', '',1, '13624914663', 'subing.xiao@pactera.com', 3, 'HUIZHOU LONGJI', '502673369', 2, now(), 'system', now(), 'system'),
  ('AdminWuxi', '',1, '18842666017', 'yu.ren@pactera.com', 1, 'Admin Wuxi', 'AdminWuxi', 2, now(), 'system', now(), 'system'),
  ('WarehouseWuxi', '',1, '13998421799', 'gary.liu@pactera.com', 2, 'Warehouse Wuxi', 'WarehouseWuxi', 2, now(), 'system', now(), 'system'),
  ('502673370', '',1, '15998553974', 'daguang.li@pactera.com', 3, 'TRS Technologies', '502673370', 3, now(), 'system', now(), 'system'),
  ('502673371', '',1, '15998553974', 'daguang.li@pactera.com', 3, 'MAN & MEDICAL', '502673371', 3, now(), 'system', now(), 'system'),
  ('AdminHino', '',1, '18842666017', 'yu.ren@pactera.com', 1, 'Admin Hino', 'AdminHino', 3, now(), 'system', now(), 'system'),
  ('WarehouseHino', '',1, '13998421799', 'gary.liu@pactera.com', 2, 'Ware houseHino', 'WarehouseHino', 3, now(), 'system', now(), 'system'),
  ('502673372', '',1, '13624914663', 'subing.xiao@pactera.com', 3, 'Nanbo', '502673372', 2, now(), 'system', now(), 'system'),
    ('502673373', '',1, '13624914663', 'subing.xiao@pactera.com', 3, 'Huashuo', '502673373', 2, now(), 'system', now(), 'system');
 
    
    alter table t003_booking add c_score varchar not null default '';
alter table t003_booking add c_exception varchar not null default '';
alter table t003_booking add c_comment varchar not null default '';

alter table t003_booking add column c_delivery_status varchar not null default '';
alter table t003_booking add column c_delivery_detail varchar not null default '';
alter table t003_booking add column c_abnormal varchar not null default '';
alter table t003_booking add column c_abnormal_detail varchar not null default '';
alter table t003_booking add column c_comment varchar not null default '';

alter table t002_user add column C_CONTACT varchar null;
alter table t002_user add column C_BUYER_RELATION varchar null;
alter table t002_user add column C_BUYER_PERSON varchar null;
alter table t002_user add column C_BUYER_PHONE varchar null;

alter table T002_USER drop constraint FK_T002_USE_REFERENCE_T006_REGION;
alter table T002_USER add column C_REGION_GROUP varchar null;
update t002_user set c_region_group = n_region_id;

alter table T006_REGION add column C_REGION_NAME varchar null;
alter table T006_REGION add column N_STATUS int default 1;

update T006_REGION set C_REGION_NAME = '天津工厂' where c_region = 'Tianjin';
update T006_REGION set C_REGION_NAME = '无锡工厂' where c_region = 'Wuxi';
update T006_REGION set C_REGION_NAME = '日野工場' where c_region = 'Hino';

ALTER SEQUENCE public.t006_region_n_region_id_seq
  INCREMENT 1
  MINVALUE 4
  MAXVALUE 9223372036854775807
  START 4
  CACHE 1;
ALTER TABLE public.t006_region_n_region_id_seq
  OWNER TO postgres;
  
alter table t006_region add constraint unique_region unique(c_region);

alter table t002_user add column c_goods_helper character varying COLLATE pg_catalog."default" ; 

alter table t003_booking add column D_ENTER_TIME timestamp null;
alter table t003_booking add column D_EXIT_TIME timestamp null;
alter table t003_booking add column C_ENTER_OPERATOR varchar null;
alter table t003_booking add column C_EXIT_OPERATOR varchar null;

alter table t003_booking add column N_BOOKING_IDENTIFIER bigint not null default (extract(year from now())*100000000 + extract(month from now())*1000000 + extract(day  from now())*10000 + nextval('t003_booking_identifier_seq'))

update t003_booking set c_delivery_status = '' where c_delivery_status is null or c_delivery_status = 'null';
update t003_booking set c_abnormal = '' where c_abnormal is null or c_abnormal = 'null';

alter table T006_REGION add C_IMAGE_DATA varchar not null default '';

update t003_booking set c_delivery_status = null where c_delivery_status = '';

alter table T003_BOOKING add C_ASSIGN_ID varchar NOT NULL DEFAULT '';

ALTER TABLE public.t007_relation ADD COLUMN c_forwarding text;
ALTER TABLE public.t003_booking ADD COLUMN c_forwarding text;
ALTER TABLE public.t002_user ADD COLUMN c_forwarding text;