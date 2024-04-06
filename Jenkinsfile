pipeline {
    agent any
     tools {
        maven "MAVEN"
    }
    stages {
        stage("Build the project"){
            steps{
                sh "mvn clean"
                sh "mvn package"
            }
        }
        stage("run the docker containers"){
            steps{
                sh "docker-compose down"
                sh "docker-compose up --build -d"       
            }
        }
}
}
