create table public.department (
  department_id serial not null
  , department_name character varying(255) not null
  , department_description text
  , creation_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , creator integer
  , update_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , updater integer
  , primary key (department_id)
);