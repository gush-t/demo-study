

-- 如果表不存在则新建表
create table if not exists `worker`(
    `id` integer not null ,
    `workerName` VARCHAR(50) DEFAULT NULL,
    `newWorker` boolean default false,
    `entryTime` date,
    primary key (`id`)
    )engine = InnoDB DEFAULT CHARSET = UTF8;

create table if not exists `student`(
    `id` integer not null ,
    `stuName` VARCHAR(50) DEFAULT NULL,
    `stuClass` VARCHAR(50) DEFAULT NULL,
    `stuSchool` VARCHAR(50) DEFAULT NULL,
    primary key (`id`)
)engine = InnoDB DEFAULT CHARSET = UTF8;