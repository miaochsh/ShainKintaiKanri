create table public.users (
  user_id serial not null
  , name character varying(255) not null
  , password character varying(255) not null
  , email character varying(255)
  , address character varying(255)
  , phone character varying(20)
  , update_date timestamp(6) without time zone
  , create_date timestamp(6) without time zone default now()
  , delete_date timestamp(6) without time zone
  , primary key (user_id)
);