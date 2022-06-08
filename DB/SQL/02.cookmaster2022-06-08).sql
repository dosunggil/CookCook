-- cookmaster 화면
create table tbl_post(
post_seq		VARCHAR2(10)			PRIMARY KEY	,
post_title		nVARCHAR2(100)		not null		,
post_content		nVARCHAR2(500)		not null		,
post_img_big		VARCHAR2(500)				,
post_img_small		VARCHAR2(500)				,
MANUAL_SEQ		VARCHAR2(10)				,
POST_STAR		NUMBER(3)				
 
);

create table tbl_recipe(
RCP_SEQ		VARCHAR2(10)			PRIMARY KEY	,
RCP_NM		nVARCHAR2(50)		NOT NULL		,
INFO_ENG		NUMBER(5)				,
HASH_TAG		nVARCHAR2(30)				,
ATT_FILE_NO_MAIN		VARCHAR2(100)				,
ATT_FILE_NO_MK		VARCHAR2(100)				,
RCP_PARTS_DTLS		nVARCHAR2(500)				
);

create table tbl_manual(
MANUAL_SEQ		VARCHAR2(10)			PRIMARY KEY	,
RCP_SEQ		VARCHAR2(10)		NOT NULL		,
MANUAL		nVARCHAR2(100)				,
MANUAL_IMG		nVARCHAR2(100)				,
MANUAL_NUM		NUMBER(2)				
);

create table tbl_user (
u_username		VARCHAR2(50)			PRIMARY KEY	,
u_password		VARCHAR2(50)		not null		,
u_nickname		VARCHAR2(50)		not null		,
u_name		nVARCHAR2(50)		not null		,
u_email		nVARCHAR2(50)		not null		,
u_role		VARCHAR2(20)		not null		
);

create table tbl_comment(
c_seq		VARCHAR2(10)			PRIMARY KEY	,
c_comment		NVARCHAR2(500)		not null		,
c_username		VARCHAR2(50)				,
c_post_seq		VARCHAR2(10)				
);

create table tbl_evaluation(
c_seq		VARCHAR2(10)			PRIMARY KEY	,
s_evaluation		VARCHAR2(10)		not null		,
c_username		VARCHAR2(50)				,
c_post_seq		VARCHAR2(10)				
);

create table tbl_registerdate(
c_seq		VARCHAR2(10)			PRIMARY KEY	,
r_date		VARCHAR2(50)		not null		,
c_username		VARCHAR2(50)				,
c_post_seq		VARCHAR2(10)				
);