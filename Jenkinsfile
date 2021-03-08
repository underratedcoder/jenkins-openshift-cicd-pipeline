pipeline {

    agent any

    stages {
        stage('Compile Stage') {
            steps {
                withMaven(maven : '3.1.0') {
                    sh 'mvn clean compile'
                }
            }
        }
        stage('Testing Stage') {
            steps {
                withMaven(maven : '3.1.0') {
                    sh 'mvn test'
                }
            }
        }
    }

}