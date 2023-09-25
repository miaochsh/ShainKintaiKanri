create table public.faq (
  id serial not null
  , name character varying(255)
  , question1 character varying(255)
  , answer1 character varying(255)
  , question2 character varying(255)
  , answer2 character varying(255)
  , question3 character varying(255)
  , answer3 character varying(255)
  , update_date timestamp(6) without time zone
  , create_date timestamp(6) without time zone
  , delete_date timestamp(6) without time zone
  , primary key (id)
);