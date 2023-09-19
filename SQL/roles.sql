create table public.roles (
  role_id serial not null
  , role_name character varying(255) not null
  , role_description text
  , primary key (role_id)
);