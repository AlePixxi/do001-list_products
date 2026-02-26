pipeline {
    agent any

    environment {
        IMAGE_NAME = "list-products:$BRANCH_NAME.$BUILD_NUMBER"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build Docker Image') {
            steps {
                sh "docker build -t ${IMAGE_NAME} ."
            }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}
