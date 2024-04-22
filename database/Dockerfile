FROM postgres:alpine
LABEL authors="Kydane"
ADD src/main/resources/1_schema.sql /docker-entrypoint-initdb.d/
ADD src/main/resources/2_data.sql /docker-entrypoint-initdb.d/
