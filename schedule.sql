create table IF NOT EXISTS user
(
    id bigint not null auto_increment comment '아이디',
    psw bigint not null comment '비밀번호',
    username varchar(255) not null comment '이름',
    primary key (id)
);

create table IF NOT EXISTS  schedule
(
    id bigint not null auto_increment comment '아이디', 
    date varchar(255) not null comment '작성된 날짜',
    newdate varchar(255) not null comment '수정된 날짜',
    contents varchar(500) not null comment '내용',
    foreign key(id) references user(id)
);

