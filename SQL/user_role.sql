create table public.user_role (
  user_role_id serial not null
  , user_id integer
  , role_id integer
  , primary key (user_role_id)
);