create table public.notifications (
  id serial not null
  , name character varying(255) not null
  , content text
  , status character varying(50)
  , file_content bytea
  , start_time timestamp(6) without time zone not null
  , end_time timestamp(6) without time zone not null
  , primary key (id)
);