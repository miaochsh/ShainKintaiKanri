create table public.notification_permissions (
  notification_id integer not null
  , role_id integer not null
  , permission character varying(255) not null
  , creation_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , creator integer
  , update_date timestamp(6) without time zone default CURRENT_TIMESTAMP
  , updater integer
  , primary key (notification_id, role_id, permission)
);