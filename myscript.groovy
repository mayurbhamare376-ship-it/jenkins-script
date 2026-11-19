pipeline {
    agent any

    stages { 
        stage('pull') {
            steps {
                git branch: 'main', url: 'https://github.com/mayurbhamare376-ship-it/aws-nginx-project.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
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