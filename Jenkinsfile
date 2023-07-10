pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checkout ..'
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '213647ba-0511-44d2-a55f-61c9197fdadc', url: 'git@github.com:mohangurrampati1/gcp-repo.git']])
            }
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
