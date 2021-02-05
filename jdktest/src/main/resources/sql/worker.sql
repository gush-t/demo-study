

-- 如果表不存在则新建表
create table if not exists `worker`(
    `id` integer not null ,
    `workerName` VARCHAR(50) DEFAULT NULL,
    `newWorker` boolean default false,
    `entryTime` date,
    primary key (`id`)
    )engine = InnoDB DEFAULT CHARSET = UTF8;