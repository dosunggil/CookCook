-- cookmaster 화면

create table tbl_recipe(
RCP_SEQ		number			PRIMARY KEY	,
RCP_NM		nVARCHAR2(125)		not null		,
rcp_content	nVARCHAR2(1000)		,
ATT_FILE_NO_MK		VARCHAR2(500)				,
INFO_ENG		    NUMBER(5)				,
RCP_PARTS_DTLS		nVARCHAR2(1000)				,
HASH_TAG	    nVARCHAR2(200)	,
POST_STAR  number(5)
 
);

select * from tbl_recipe;
drop table tbl_recipe;
create SEQUENCE seq_recipe start with 1 increment by 1;
drop SEQUENCE seq_recipe;
select seq_recipe.nextval from dual;

create table tbl_recipe_manual(
manual_seq		VARCHAR2(10)			PRIMARY KEY	,
RCP_SEQ		VARCHAR2(10)		NOT NULL		,
manual		    nVARCHAR2(200)				,
manual_img      nVARCHAR2(500)				,
manual_num		NUMBER(2)				
);
drop table tbl_recipe_manual;
create SEQUENCE seq_manual start with 1 increment by 1;


CREATE TABLE tbl_users (
    username VARCHAR2(50)  PRIMARY KEY,
     password nVARCHAR2(125) NOT NULL,  
    email VARCHAR2(125) ,   
    nickname nVARCHAR2(125),        
    role VARCHAR2(5),
    photo varchar2(1000),
    bio varchar2(1000)
);
drop table tbl_users;
select * from tbl_users;
--insert into tbl_user (u_username, u_password, u_nickname, u_name, u_email, u_role)
--VALUES ('dosunggil', 'dosunggil', '도성길', '도성','chothegenius@gmail.com','admin');


/*
    tbl_books 와 tbl_users 테이블이 있다.
   
    
    그리고, 어떤 사용자가 도서를 추가했는지를 table 에 데이터로 저장하고
    로그인한 사용자의 mypage 에서 자신이 추가한 도서 목록을 볼 수 있도록 한다.

    레시피정보와 사용자간의 "레시피등록" 정보를 저장할 Relation 을 설계하기
    
    tbl_buybook
    isbn 칼럼, username 칼럼, 구입일자 칼럼
    isbn 카럼은 tbl_books 와 FK
    username 칼럼은 tbl_users 와 FK

*/
desc tbl_recipe;
desc tbl_user;

drop table tbl_user_recipe;
create table tbl_user_recipe(
    b_seq number not null,
    b_username varchar2(50) not null,
    b_date varchar2(10),
    PRIMARY key(b_seq, b_username)
);

select * from tbl_user_recipe;

-- tbl_books 테이블과 FK 설정

alter table tbl_user_recipe
add CONSTRAINT FK_POST_RECIPE
FOREIGN key (b_seq) REFERENCES tbl_recipe(RCP_SEQ);

alter table tbl_user_recipe
add CONSTRAINT FK_POST_USER
FOREIGN key (b_username) REFERENCES tbl_users(username);