create table public.department (
  department_id serial not null
  , department_name character varying(255) not null
  , department_description text
  , primary key (department_id)
);