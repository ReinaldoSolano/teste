pipeline {
    agent any

    stages {
        stage('Checkout Source') {
            steps {
                git url: 'https://github.com/ReinaldoSolano/teste.git', branch:'master'
            }
        }
        stage('Build Image') {
            steps {
                script {
                    dockerapp = docker.build("rssystem/user:${env.BUILD_ID}",
                    '-f ./src/<projeto>/Dockerfile .')
                }
            }
        }
        stage('Push Image') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
                    dockerapp.push('latest')
                    dockerapp.push("${env.BUILD_ID}")
                    }
                }
            }
        }
    }
}