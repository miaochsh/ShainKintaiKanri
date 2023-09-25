create table public.user_department (
  user_department_id serial not null
  , user_id integer
  , department_id integer
  , creation_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , creator integer
  , update_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , updater integer
  , primary key (user_department_id)
);