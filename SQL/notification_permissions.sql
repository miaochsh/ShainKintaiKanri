create table public.notification_permissions (
  notification_id integer not null
  , role_id integer not null
  , permission character varying(255) not null
  , primary key (notification_id, role_id, permission)
);