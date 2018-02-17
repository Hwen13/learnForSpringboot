-- Create table
create table T_SSQ_HISTORY_DATA_BULE
(
  expect  NUMBER not null,
  blue_01 NUMBER(1),
  blue_02 NUMBER(1),
  blue_03 NUMBER(1),
  blue_04 NUMBER(1),
  blue_05 NUMBER(1),
  blue_06 NUMBER(1),
  blue_07 NUMBER(1),
  blue_08 NUMBER(1),
  blue_09 NUMBER(1),
  blue_10 NUMBER(1),
  blue_11 NUMBER(1),
  blue_12 NUMBER(1),
  blue_13 NUMBER(1),
  blue_14 NUMBER(1),
  blue_15 NUMBER(1),
  blue_16 NUMBER(1)
)

-- Create/Recreate primary, unique and foreign key constraints
alter table T_SSQ_HISTORY_DATA_BULE
  add constraint PK_T_SSQ_HISTORY_DATA_BULE primary key (EXPECT);
