pipeline {
    agent any

    stages {  
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean package -Dskiptests'
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
