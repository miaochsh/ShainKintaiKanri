create table public.notifications (
  id serial not null
  , title character varying(255) not null
  , content text not null
  , status character varying(50) default '通常'
  , file_content bytea
  , start_time timestamp(6) without time zone
  , end_time timestamp(6) without time zone
  , posted_by integer
  , created_at timestamp(6) without time zone default CURRENT_TIMESTAMP
  , updated_at timestamp(6) without time zone default CURRENT_TIMESTAMP
  , creation_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , creator integer
  , update_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , updater integer
  , primary key (id)
);