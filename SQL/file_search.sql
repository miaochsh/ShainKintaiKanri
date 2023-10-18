create table public.file_search (
  file_id serial not null
  , file_name character varying(255)
  , file_description text
  , file_path character varying(255)
  , created_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , creator character varying(255)
  , update_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , updater character varying(255)
  , department_id character varying(255)
  , deleted_flg character varying(1)
  , published_flg character varying(1)
  , primary key (file_id)
);