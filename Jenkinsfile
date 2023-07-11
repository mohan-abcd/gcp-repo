pipeline {
    agent any
    tools { 
        maven 'Maven 3.9.2'  
    }
    stages {  
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn -B -DskipTests clean package' 
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
