CREATE TABLE bss_shain_manage_db.`user_info` (
  `accountId` varchar(255) NOT NULL,
  `password` char(10) NOT NULL,
   PRIMARY KEY (`accountId`)
);

select * from bss_shain_manage_db.`user_info`;
select * from user_info;
INSERT INTO user_info VALUES ("111@bss.com", "111111");