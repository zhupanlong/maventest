prompt PL/SQL Developer import file
prompt Created on 2018年12月9日 by Administrator
set feedback off
set define off
prompt Creating T_LOANAPPLICATION...
create table T_LOANAPPLICATION
(
  id           VARCHAR2(20) not null,
  cid          VARCHAR2(20),
  pid          VARCHAR2(20),
  cusname      VARCHAR2(20),
  proname      VARCHAR2(20),
  loancode     VARCHAR2(20),
  loandate     VARCHAR2(20),
  loanamount   VARCHAR2(20),
  coveragedate VARCHAR2(20),
  product      VARCHAR2(20),
  auditor      VARCHAR2(20),
  auditordate  VARCHAR2(20),
  status       VARCHAR2(2),
  appointdate  VARCHAR2(20)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
comment on column T_LOANAPPLICATION.cusname
  is '客户名称';
comment on column T_LOANAPPLICATION.proname
  is '产品名称';
comment on column T_LOANAPPLICATION.appointdate
  is '预约日期';
alter table T_LOANAPPLICATION
  add constraint PK_LOANAPPLICATION primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Creating T_BANKMONEY...
create table T_BANKMONEY
(
  id              VARCHAR2(20) not null,
  loanapplication VARCHAR2(20),
  loancode        VARCHAR2(20),
  period          VARCHAR2(20),
  accrual         VARCHAR2(20),
  capital         VARCHAR2(20)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table T_BANKMONEY
  add constraint PK_BNCKMONEY primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table T_BANKMONEY
  add constraint FK_BNCKMONEY1 foreign key (LOANAPPLICATION)
  references T_LOANAPPLICATION (ID) on delete cascade;

prompt Creating T_CONSUMER_BANK...
create table T_CONSUMER_BANK
(
  id            VARCHAR2(20) not null,
  cid           VARCHAR2(20),
  bank          VARCHAR2(20),
  cardno        VARCHAR2(20),
  cardname      VARCHAR2(20),
  province      VARCHAR2(20),
  city          VARCHAR2(20),
  county        VARCHAR2(20),
  active        VARCHAR2(20),
  bankname      VARCHAR2(20),
  bankno        VARCHAR2(20),
  customer_code VARCHAR2(20),
  customer_name VARCHAR2(20),
  id_card       VARCHAR2(20),
  mobile        VARCHAR2(20),
  email         VARCHAR2(20),
  address       VARCHAR2(20)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table T_CONSUMER_BANK
  add constraint PK_CONSUMER_BANK primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Creating T_CUSTOMER...
create table T_CUSTOMER
(
  cid           VARCHAR2(20) not null,
  customer_code VARCHAR2(20),
  customer_name VARCHAR2(20),
  id_card       VARCHAR2(20),
  mobile        VARCHAR2(20),
  email         VARCHAR2(20),
  address       VARCHAR2(20)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table T_CUSTOMER
  add constraint PK_CUSTOMER primary key (CID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Creating T_DEDUCT...
create table T_DEDUCT
(
  id         VARCHAR2(20) not null,
  mchntcd    VARCHAR2(20),
  mchntpass  VARCHAR2(20),
  bankno     VARCHAR2(20),
  bankname   VARCHAR2(20),
  cusnm      VARCHAR2(20),
  mobileno   VARCHAR2(20),
  credtno    VARCHAR2(20),
  acntno     VARCHAR2(20),
  acntnm     VARCHAR2(20),
  acntpro    VARCHAR2(20),
  acntcity   VARCHAR2(20),
  loanamount VARCHAR2(20),
  ordernum   VARCHAR2(20),
  serialnum  VARCHAR2(20),
  platform   VARCHAR2(20),
  deductres  VARCHAR2(20),
  deducttime VARCHAR2(20),
  state      VARCHAR2(2),
  remark     VARCHAR2(20)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
comment on column T_DEDUCT.mchntcd
  is '商户编号';
comment on column T_DEDUCT.mchntpass
  is '商户密码';
comment on column T_DEDUCT.bankno
  is '银行编号';
comment on column T_DEDUCT.bankname
  is '银行名称';
comment on column T_DEDUCT.cusnm
  is '客户姓名';
comment on column T_DEDUCT.mobileno
  is '手机号';
comment on column T_DEDUCT.credtno
  is '身份证';
comment on column T_DEDUCT.acntno
  is '银行账号';
comment on column T_DEDUCT.acntnm
  is '账户名称';
comment on column T_DEDUCT.acntpro
  is '省份';
comment on column T_DEDUCT.acntcity
  is '城市';
comment on column T_DEDUCT.loanamount
  is '支付金额';
comment on column T_DEDUCT.ordernum
  is '订单号';
comment on column T_DEDUCT.serialnum
  is '流水号';
comment on column T_DEDUCT.platform
  is '划扣平台';
comment on column T_DEDUCT.deductres
  is '划扣结果 结果描述';
comment on column T_DEDUCT.deducttime
  is '划扣时间';
comment on column T_DEDUCT.state
  is '出借状态';
comment on column T_DEDUCT.remark
  is '备注';
alter table T_DEDUCT
  add constraint PK_DEDUCT primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Creating T_MENU...
create table T_MENU
(
  id       VARCHAR2(20) not null,
  name     VARCHAR2(20),
  parentid VARCHAR2(20),
  iconcls  VARCHAR2(20),
  url      VARCHAR2(50),
  enable   VARCHAR2(2),
  levelid  VARCHAR2(2)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table T_MENU
  add constraint PK_MENU primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Creating T_PRODUCT...
create table T_PRODUCT
(
  id       VARCHAR2(20) not null,
  name     VARCHAR2(20),
  proceeds VARCHAR2(20),
  isshelf  VARCHAR2(2),
  period   VARCHAR2(2)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table T_PRODUCT
  add constraint PK_PRODUCT primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Creating T_ROLE...
create table T_ROLE
(
  id   VARCHAR2(20) not null,
  name VARCHAR2(20)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table T_ROLE
  add constraint PK_ROLE1 primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Creating T_TREE...
create table T_TREE
(
  id      VARCHAR2(20) not null,
  text    VARCHAR2(20),
  state   VARCHAR2(10) default 'open',
  checked VARCHAR2(2) default 0,
  iconcls VARCHAR2(20),
  pid     VARCHAR2(20)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
comment on column T_TREE.id
  is '节点的ID';
comment on column T_TREE.text
  is '节点显示的文本信息';
comment on column T_TREE.state
  is '默认open,当为‘closed’时说明此节点下有子节点，否则此节点为叶子节点';
comment on column T_TREE.checked
  is '指示节点是否被选中,0 未选中，1选中';
comment on column T_TREE.iconcls
  is '定义该节点的样式';
comment on column T_TREE.pid
  is '定义该节点的父节点';
alter table T_TREE
  add constraint PK_TREE primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Creating T_USER...
create table T_USER
(
  id       VARCHAR2(20) not null,
  username VARCHAR2(20),
  password VARCHAR2(20),
  name     VARCHAR2(20),
  sex      VARCHAR2(2),
  email    VARCHAR2(20),
  qq       VARCHAR2(20),
  weixin   VARCHAR2(30),
  regtime  VARCHAR2(30) default sysdate,
  enable   VARCHAR2(2)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table T_USER
  add constraint PK_USER1 primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating T_USER_ROLE...
create table T_USER_ROLE
(
  id     VARCHAR2(20) not null,
  userid VARCHAR2(20),
  roleid VARCHAR2(20)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table T_USER_ROLE
  add constraint PK_USER_ROLE primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Disabling triggers for T_LOANAPPLICATION...
alter table T_LOANAPPLICATION disable all triggers;
prompt Disabling triggers for T_BANKMONEY...
alter table T_BANKMONEY disable all triggers;
prompt Disabling triggers for T_CONSUMER_BANK...
alter table T_CONSUMER_BANK disable all triggers;
prompt Disabling triggers for T_CUSTOMER...
alter table T_CUSTOMER disable all triggers;
prompt Disabling triggers for T_DEDUCT...
alter table T_DEDUCT disable all triggers;
prompt Disabling triggers for T_MENU...
alter table T_MENU disable all triggers;
prompt Disabling triggers for T_PRODUCT...
alter table T_PRODUCT disable all triggers;
prompt Disabling triggers for T_ROLE...
alter table T_ROLE disable all triggers;
prompt Disabling triggers for T_TREE...
alter table T_TREE disable all triggers;
prompt Disabling triggers for T_USER...
alter table T_USER disable all triggers;
prompt Disabling triggers for T_USER_ROLE...
alter table T_USER_ROLE disable all triggers;
prompt Disabling foreign key constraints for T_BANKMONEY...
alter table T_BANKMONEY disable constraint FK_BNCKMONEY1;
prompt Loading T_LOANAPPLICATION...
prompt Table is empty
prompt Loading T_BANKMONEY...
prompt Table is empty
prompt Loading T_CONSUMER_BANK...
prompt Table is empty
prompt Loading T_CUSTOMER...
prompt Table is empty
prompt Loading T_DEDUCT...
prompt Table is empty
prompt Loading T_MENU...
prompt Table is empty
prompt Loading T_PRODUCT...
prompt Table is empty
prompt Loading T_ROLE...
prompt Table is empty
prompt Loading T_TREE...
prompt Table is empty
prompt Loading T_USER...
insert into T_USER (id, username, password, name, sex, email, qq, weixin, regtime, enable)
values ('1', 'zpl', '654321', '朱潘龙', '0', '1234@163.com', '1143307220', null, '2018/12/8', '0');
commit;
prompt 1 records loaded
prompt Loading T_USER_ROLE...
prompt Table is empty
prompt Enabling foreign key constraints for T_BANKMONEY...
alter table T_BANKMONEY enable constraint FK_BNCKMONEY1;
prompt Enabling triggers for T_LOANAPPLICATION...
alter table T_LOANAPPLICATION enable all triggers;
prompt Enabling triggers for T_BANKMONEY...
alter table T_BANKMONEY enable all triggers;
prompt Enabling triggers for T_CONSUMER_BANK...
alter table T_CONSUMER_BANK enable all triggers;
prompt Enabling triggers for T_CUSTOMER...
alter table T_CUSTOMER enable all triggers;
prompt Enabling triggers for T_DEDUCT...
alter table T_DEDUCT enable all triggers;
prompt Enabling triggers for T_MENU...
alter table T_MENU enable all triggers;
prompt Enabling triggers for T_PRODUCT...
alter table T_PRODUCT enable all triggers;
prompt Enabling triggers for T_ROLE...
alter table T_ROLE enable all triggers;
prompt Enabling triggers for T_TREE...
alter table T_TREE enable all triggers;
prompt Enabling triggers for T_USER...
alter table T_USER enable all triggers;
prompt Enabling triggers for T_USER_ROLE...
alter table T_USER_ROLE enable all triggers;
set feedback on
set define on
prompt Done.
