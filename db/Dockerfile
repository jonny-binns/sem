#use the latest MySQL image
FROM mysql
#set the working directory
WORKDIR /tmp
#copy all the files to the working directory of the container
COPY test_db/*.sql /tmp/
COPY test_db/*.dump /tmp/
#copy main SQL file to docker-entrypoint-init.db.d.
#scripts and SQL files in this filder are executed on container startup
#this is specific to MySQL
COPY test_db/employees.sql /docker-entrypoint-initdb.d
#set the root password
ENV MYSQL_ROOT_PASSWORD example