-- member 테이블 생성
 CREATE TABLE `kyj`.`member`(
  `memberId` VARCHAR(8) NOT NULL,
  `memberPwd`VARCHAR(200) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `memberName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`memberId`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);
 
 -- 아이디 중복 검사
 select count(*) from member where memberId= 'jeffkim';
 
 -- 회원 가입
 insert into member(memberId, memberPwd, email, memberName)
 values(?,?,?,?)
 
 -- -----------------------------------------------------------
 -- diary 테이블 생성
 
--  CREATE TABLE `kyj`.`diary` (
--   `dno` INT NOT NULL AUTO_INCREMENT,
--   `title` VARCHAR(100) NOT NULL,
--   `dueDate` DATE NOT NULL,
--   `writer` VARCHAR(8) NOT NULL,
--   `finished` TINYINT NULL DEFAULT '0',
--   PRIMARY KEY (`dno`));

-- insert into diary (title, dueDate, writer) values(?);

use kyj;
select * from diary order by dno desc;

-- 다이어리 title , dueDate 수정
update diary set title = ? , duedate = ? where dno = ?

-- 로그인
select * from member where memberId = ? and memberPwd = sha1(md5(?)) 
 