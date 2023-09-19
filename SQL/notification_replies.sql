create table public.notification_replies (
  id serial not null
  , notification_id integer
  , user_id integer
  , reply_content text not null
  , reply_time timestamp(6) without time zone not null
  , primary key (id)
);