create table public.roles (
  role_id serial not null
  , role_name character varying(255) not null
  , role_description text
  , creation_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , creator integer
  , update_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , updater integer
  , primary key (role_id)
);