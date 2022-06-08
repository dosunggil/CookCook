
create TABLESPACE cookmaster
DATAFILE 'c:/oraclexe/data/cookmaster.dbf'
size 1m AUTOEXTEND on next 1k;

CREATE USER cookmaster IDENTIFIED BY 12341234
DEFAULT TABLESPACE cookmaster;

GRANT DBA TO cookmaster;


