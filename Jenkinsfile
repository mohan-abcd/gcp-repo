pipeline {
    agent any

    stages {  
        stage('Build') {
            steps {
                echo 'Building..'
                sh '/home/annamalai_sathish/mvn/apache-maven-3.9.2/bin/mvn clean install -DskipTests' 
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
