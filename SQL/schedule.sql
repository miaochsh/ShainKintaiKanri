create table public.schedule (
 id serial not null
 , register_name character varying(255) not null
 , register_email character varying(255) not null
 , relation_email character varying(255)
 , agenda_name character varying(255) not null
 , place character varying(255)
 , content character varying(255)
 , start_agenda timestamp(6) without time zone
 , finish_agenda timestamp(6) without time zone
 , publication_range character varying(1)
 , file_content bytea
 , register_date timestamp(6) without time zone
 , update_date timestamp(6) without time zone
 , updater character varying(255)
 , primary key (id)
 );