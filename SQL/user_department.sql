create table public.user_department (
  user_department_id serial not null
  , user_id integer
  , department_id integer
  , primary key (user_department_id)
);