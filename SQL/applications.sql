create table public.applications (
 id serial not null
 , user_name character varying(255) not null
 , email character varying(255) not null
 , user_application character varying(1)
 , status character varying(1)
 , to_department character varying(1)
 , content character varying(255)
 , application_date timestamp(6) without time zone
 , file_content bytea
 , primary key (id)
 );