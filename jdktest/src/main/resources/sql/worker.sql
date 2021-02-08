

-- 如果表不存在则新建表
create table if not exists `worker`(
    `id` integer not null primary key auto_increment,
    `workerName` VARCHAR(50) DEFAULT NULL,
    `newWorker` boolean default false,
    `entryTime` date
    )engine = InnoDB DEFAULT CHARSET = UTF8;

create table if not exists `student`(
    `id` integer not null primary key auto_increment,
    `stuName` VARCHAR(50) DEFAULT NULL,
    `stuClass` VARCHAR(50) DEFAULT NULL,
    `stuSchool` VARCHAR(50) DEFAULT NULL
)engine = InnoDB DEFAULT CHARSET = UTF8;