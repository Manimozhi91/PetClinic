FROM openjdk:17
COPY ./target/PetClinic-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","PetClinic-0.0.1-SNAPSHOT.jar"]