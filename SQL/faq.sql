create table public.faq (
  id serial not null
  , claimer character varying(255)
  , question character varying(255)
  , reponder character varying(255)
  , answer character varying(255)
  , answerflg character varying(1)
  , update_date timestamp(6) without time zone
  , create_date timestamp(6) without time zone
  , delete_date timestamp(6) without time zone
  , blob_data bytea
  , primary key (id)
);