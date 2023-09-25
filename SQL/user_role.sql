create table public.user_role (
  user_role_id serial not null
  , user_id integer
  , role_id integer
  , creation_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , creator integer
  , update_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , updater integer
  , primary key (user_role_id)
);