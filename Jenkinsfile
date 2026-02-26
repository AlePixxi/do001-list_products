pipeline {
    agent any

    environment {
        IMAGE_NAME = "list-products:$BUILD_NUMBER"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build Maven') {
            steps {
                sh 'mvn -B clean package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build(env.IMAGE_NAME, '-f dockerfile .')
                }
            }
        }
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            cleanWs()
        }
    }
}
