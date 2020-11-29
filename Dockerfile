FROM java:8
EXPOSE 8080
ADD /target/emart-0.0.1-SNAPSHOT.jar emart.jar
ENTRYPOINT ["java","-jar","emart.jar"]