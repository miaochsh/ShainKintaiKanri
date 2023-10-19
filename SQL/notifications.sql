create table public.notifications (
  id serial not null
  , title character varying(255) not null
  , content text not null
  , status character varying(1) default 1
  , file_content bytea
  , start_time timestamp(6) without time zone
  , end_time timestamp(6) without time zone
  , creater integer
  , creation_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , updater integer
  , update_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , primary key (id)
);