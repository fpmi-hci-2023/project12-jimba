pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/fpmi-hci-2023/project12-jimba.git'
                sh './mvnw clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'test'
            }

            post {
                always {
                    junit '**/target/surfire-reports/TEST-*.xml'
                }
            }
        }
    }
}