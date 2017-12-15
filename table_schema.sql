CREATE TABLE users (
	id        text PRIMARY KEY,
	name      text NOT NULL,
	password  text NOT NULL,
	team_id   text,
	part_cd   text,
	mobile    text,
	email     text,
	use_yn    text
)
;

CREATE TABLE wiki (
	id            bigserial PRIMARY KEY,
	title         text,
	content       text,
	final_user_id text,
	final_mod_dt  date,
	use_yn        text
)
;

CREATE TABLE code (
	grp          text,
	id           text,
	name         text,
	decription   text,
	use_yn       text,
    CONSTRAINT PK_CODE PRIMARY KEY (grp, id)
)
;

INSERT INTO code VALUES ('0000', 'M001', '시스템 마스터 정보', '시스템에서 사용하는 각종 마스터 데이터 정보', 'Y');
INSERT INTO code VALUES ('M001', '0001', 'AMOREPACIFIC AMS POS Docs', '페이지 헤드 타이틀', 'Y');
INSERT INTO code VALUES ('M001', '0002', 'AMOREPACIFIC AMS POS Docs', '페이지 상단 네비게이션 타이틀', 'Y');
INSERT INTO code VALUES ('M001', '0003', 'Copyright © IBM GBS Korea 2017', '페이지 하단 FOOTER 내용', 'Y');

Menu도 만들어야되고, 로그인 필수여부 옵션