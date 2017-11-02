

/*==============================================================*/
/* Table: allstock                                              */
/*==============================================================*/
create table allstock (
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(8)           not null,
   py                   VARCHAR(4)           not null,
   industry             VARCHAR(16)          not null,
   pe                   FLOAT8               not null,
   pb                   FLOAT8               not null,
   totalvalue           FLOAT8               not null,
   currency             FLOAT8               not null,
   constraint PK_ALLSTOCK primary key (code)
);

/*==============================================================*/
/* Table: attend                                                */
/*==============================================================*/
create table attend (
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(8)           not null,
   "time"               DATE                 not null,
   trans                FLOAT8               not null,
   signal               INT4                 not null,
   ascrate              FLOAT8               not null,
   descrate             FLOAT8               not null,
   equalrate            FLOAT8               not null,
   constraint PK_ATTEND primary key (code)
);

/*==============================================================*/
/* Table: bk_trans                                              */
/*==============================================================*/
create table bk_trans (
   id                   SERIAL                 not null,
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(16)          not null,
   increase             FLOAT8               not null,
   trans                FLOAT8               not null,
   "time"               DATE                 not null,
   constraint PK_BK_TRANS primary key (id)
);

/*==============================================================*/
/* Table: bkrecord                                              */
/*==============================================================*/
create table bkrecord (
   id                   SERIAL                 not null,
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(16)          not null,
   increase             FLOAT8               not null,
   date                 DATE                 not null,
   "time"               INT4                 not null,
   constraint PK_BKRECORD primary key (id)
);

/*==============================================================*/
/* Table: c_trans                                               */
/*==============================================================*/
create table c_trans (
   id                   SERIAL                 not null,
   code                 VARCHAR(16)          not null,
   name                 VARCHAR(16)          not null,
   increase             FLOAT8               not null,
   trans                FLOAT8               not null,
   "time"               DATE                 not null,
   constraint PK_C_TRANS primary key (id)
);

/*==============================================================*/
/* Table: cand_rate                                             */
/*==============================================================*/
create table cand_rate (
   id                   SERIAL                 not null,
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(8)           not null,
   current              FLOAT8               not null,
   a                    FLOAT8               not null,
   b                    FLOAT8               not null,
   r                    FLOAT8               not null,
   increase             FLOAT8               not null,
   "time"               DATE                 not null,
   constraint PK_CAND_RATE primary key (id)
);

/*==============================================================*/
/* Table: cand_trans                                            */
/*==============================================================*/
create table cand_trans (
   id                   SERIAL                 not null,
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(8)           not null,
   current              FLOAT8               not null,
   increase             FLOAT8               not null,
   trans                FLOAT8               not null,
   "time"               DATE                 not null,
   constraint PK_CAND_TRANS primary key (id)
);

/*==============================================================*/
/* Table: candidate                                             */
/*==============================================================*/
create table candidate (
   id                   SERIAL                 not null,
   preflist             TEXT                 not null,
   "time"               DATE                 not null,
   constraint PK_CANDIDATE primary key (id)
);

/*==============================================================*/
/* Table: category                                              */
/*==============================================================*/
create table category (
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(16)          not null,
   type                 VARCHAR(8)           not null,
   content              VARCHAR(8000)        not null,
   constraint PK_CATEGORY primary key (code)
);

/*==============================================================*/
/* Table: collect                                               */
/*==============================================================*/
create table collect (
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(8)           not null,
   date                 DATE                 not null,
   flag                 INT4                 null,
   constraint PK_COLLECT primary key (code)
);

/*==============================================================*/
/* Table: crecord                                               */
/*==============================================================*/
create table crecord (
   id                   SERIAL                 not null,
   code                 VARCHAR(16)          not null,
   name                 VARCHAR(16)          not null,
   increase             FLOAT8               not null,
   date                 DATE                 not null,
   "time"               INT4                 not null,
   constraint PK_CRECORD primary key (id)
);

/*==============================================================*/
/* Table: daily                                                 */
/*==============================================================*/
create table daily (
   id                   SERIAL                 not null,
   code                 VARCHAR(8)           not null,
   open                 FLOAT8               not null,
   current              FLOAT8               not null,
   high                 FLOAT8               not null,
   low                  FLOAT8               not null,
   clmn                 FLOAT8               not null,
   date                 DATE                 not null,
   avg20                FLOAT8               null default 0,
   constraint PK_DAILY primary key (id)
);

/*==============================================================*/
/* Table: daily_rate                                            */
/*==============================================================*/
create table daily_rate (
   id                   SERIAL                 not null,
   code                 VARCHAR(8)           not null,
   a                    FLOAT8               not null,
   b                    FLOAT8               not null,
   r                    FLOAT8               not null,
   date                 DATE                 not null,
   constraint PK_DAILY_RATE primary key (id)
);

/*==============================================================*/
/* Table: director                                              */
/*==============================================================*/
create table director (
   id                   SERIAL                 not null,
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(8)           not null,
   "time"               DATE                 not null,
   price                FLOAT8               not null,
   type                 INT2                 not null,
   level                INT4                 not null,
   flag                 INT2                 null,
   total                INT4                 not null,
   arrow                VARCHAR(40)          not null,
   constraint PK_DIRECTOR primary key (id)
);

/*==============================================================*/
/* Table: history                                               */
/*==============================================================*/
create table history (
   id                   VARCHAR(13)          not null,
   ftime                INT4                 not null,
   ltime                INT4                 not null,
   record               TEXT                 not null,
   type                 VARCHAR(1)           not null,
   constraint PK_HISTORY primary key (id)
);

/*==============================================================*/
/* Table: holder                                                */
/*==============================================================*/
create table holder (
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(8)           not null,
   "time"               DATE                 not null,
   trans                FLOAT8               not null,
   signal               INT4                 not null,
   ascrate              FLOAT8               not null,
   descrate             FLOAT8               not null,
   equalrate            FLOAT8               not null,
   constraint PK_HOLDER primary key (code)
);

/*==============================================================*/
/* Table: indexrecord                                           */
/*==============================================================*/
create table indexrecord (
   id                   SERIAL                 not null,
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(8)           not null,
   close                FLOAT8               not null,
   open                 FLOAT8               not null,
   current              FLOAT8               not null,
   high                 FLOAT8               not null,
   low                  FLOAT8               not null,
   clmn                 FLOAT8               not null,
   money                FLOAT8               not null,
   avg                  FLOAT8               not null,
   date                 DATE                 not null,
   "time"               INT4                 not null,
   flag                 VARCHAR(8)           null,
   constraint PK_INDEXRECORD primary key (id)
);

/*==============================================================*/
/* Table: inspect                                               */
/*==============================================================*/
create table inspect (
   id                   SERIAL                 not null,
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(8)           not null,
   type                 VARCHAR(11)          not null,
   opt                  VARCHAR(8)           not null,
   value                FLOAT8               not null,
   create_date          DATE                 not null,
   flag                 INT4                 null,
   constraint PK_INSPECT primary key (id)
);

/*==============================================================*/
/* Table: message                                               */
/*==============================================================*/
create table message (
   id                   SERIAL                 not null,
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(8)           not null,
   message              VARCHAR(1024)        not null,
   flag                 INT4                 null,
   "time"               DATE                 not null,
   updatetime           DATE                 not null,
   constraint PK_MESSAGE primary key (id)
);

/*==============================================================*/
/* Table: mincolumn                                             */
/*==============================================================*/
create table mincolumn (
   code                 VARCHAR(8)           not null,
   date                 DATE                 not null
);

/*==============================================================*/
/* Table: pay_result                                            */
/*==============================================================*/
create table pay_result (
   orderId              VARCHAR(40)          not null,
   appId                VARCHAR(40)          not null,
   userId               VARCHAR(40)          not null,
   payType              INT4                 not null,
   resultCode           INT4                 not null,
   resultString         VARCHAR(40)          not null,
   tradeId              VARCHAR(40)          not null,
   amount               FLOAT8               not null,
   payTime              DATE                 not null,
   sign                 VARCHAR(40)          not null,
   comment              VARCHAR(40)          not null
);

/*==============================================================*/
/* Table: sign                                                  */
/*==============================================================*/
create table sign (
   code                 VARCHAR(8)           not null,
   sell                 INT4                 not null,
   buy                  INT4                 not null,
   prefBuy              FLOAT8               not null,
   prefSell             FLOAT8               not null,
   current              FLOAT8               not null,
   high                 FLOAT8               not null,
   low                  FLOAT8               not null,
   avg                  FLOAT8               not null,
   concept              VARCHAR(100)         not null,
   constraint PK_SIGN primary key (code)
);

/*==============================================================*/
/* Table: stockaction                                           */
/*==============================================================*/
create table stockaction (
   id                   SERIAL                 not null,
   action               INT4                 not null,
   ftime                INT4                 not null,
   ltime                INT4                 not null,
   "time"               DATE                 not null,
   queue                TEXT                 not null,
   gw                   TEXT                 not null,
   type                 INT4                 not null,
   content              VARCHAR(32)          not null,
   detail               VARCHAR(64)          not null,
   flag                 INT4                 null,
   arrow                VARCHAR(40)          not null,
   pref                 VARCHAR(300)         not null,
   pref1                VARCHAR(420)         not null,
   strong               FLOAT8               not null,
   dex                  FLOAT8               not null,
   constraint PK_STOCKACTION primary key (id)
);

/*==============================================================*/
/* Table: stockdaily                                            */
/*==============================================================*/
create table stockdaily (
   id                   SERIAL                 not null,
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(8)           not null,
   close                FLOAT8               not null,
   open                 FLOAT8               not null,
   current              FLOAT8               not null,
   high                 FLOAT8               not null,
   low                  FLOAT8               not null,
   clmn                 FLOAT8               not null,
   money                FLOAT8               not null,
   avg                  FLOAT8               not null,
   date                 DATE                 not null,
   "time"               INT4                 not null,
   flag                 VARCHAR(8)           null,
   constraint PK_STOCKDAILY primary key (id)
);

/*==============================================================*/
/* Table: stockrecord                                           */
/*==============================================================*/
create table stockrecord (
   id                   SERIAL                 not null,
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(8)           not null,
   close                FLOAT8               not null,
   open                 FLOAT8               not null,
   current              FLOAT8               not null,
   high                 FLOAT8               not null,
   low                  FLOAT8               not null,
   clmn                 FLOAT8               not null,
   money                FLOAT8               not null,
   avg                  FLOAT8               not null,
   date                 DATE                 not null,
   "time"               INT4                 not null,
   flag                 VARCHAR(8)           null,
   constraint PK_STOCKRECORD primary key (id)
);

/*==============================================================*/
/* Table: ting20                                                */
/*==============================================================*/
create table ting20 (
   id                   SERIAL                 not null,
   code                 VARCHAR(8)           not null,
   count                INT4                 not null,
   date                 DATE                 not null,
   constraint PK_TING20 primary key (id)
);

/*==============================================================*/
/* Table: version                                               */
/*==============================================================*/
create table version (
   id                   SERIAL                 not null,
   ver                  INT4                 not null,
   bcheck               INT2                 not null,
   title                VARCHAR(80)          not null,
   content              VARCHAR(1000)        not null,
   url                  VARCHAR(80)          not null,
   type                 INT4                 not null,
   extra                VARCHAR(16000)       not null,
   constraint PK_VERSION primary key (id)
);

/*==============================================================*/
/* Table: waverecord                                            */
/*==============================================================*/
create table waverecord (
   id                   SERIAL                 not null,
   code                 VARCHAR(8)           not null,
   dt                   DATE                 not null,
   wv                   TEXT                 not null,
   gw                   TEXT                 not null,
   arrow                VARCHAR(40)          not null,
   constraint PK_WAVERECORD primary key (id)
);

/*==============================================================*/
/* Table: weak                                                  */
/*==============================================================*/
create table weak (
   code                 VARCHAR(8)           not null,
   name                 VARCHAR(8)           not null,
   "time"               DATE                 not null,
   trans                FLOAT8               not null,
   signal               INT4                 not null,
   ascrate              FLOAT8               not null,
   descrate             FLOAT8               not null,
   equalrate            FLOAT8               not null
);

