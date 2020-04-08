FROM tomcat:9.0.20-jre11
COPY target/healthcheck_service.war webapps/healthcheck_service.war