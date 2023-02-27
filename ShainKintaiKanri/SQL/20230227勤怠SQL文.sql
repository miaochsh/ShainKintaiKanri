use bss_shain_manage_db;
create table bss_shain_manage_db.`shain_info` (
  `id` bigint(100) not null AUTO_INCREMENT,
  `name` varchar(100) not null,
  `jochu_saki` varchar(255) not null,
  `kintai_y` varchar(4) not null,
  `kintai_m` varchar(2) not null,
  `kinmu_data` varchar(100) not null,
  `kotsu_data` varchar(255) not null,
  `kinmu_file_data` blob,
  `kotsu_file_data` blob,
  `update_date` datetime default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  primary key (`id`)
  );
  
  select *  from shain_info;
  
  