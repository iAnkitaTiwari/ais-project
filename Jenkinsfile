pipeline {
    agent any
    stages {
        stage ('Compile Stage') {
            steps {
                    bat 'mvn clean compile site'
            }
        }
        stage ('Mutation Test Stage') {
                    steps {
                            bat 'mvn org.pitest:pitest-maven:mutationCoverage'
                    }
                }
        stage ('Testing Stage') {
            steps {
                    bat 'mvn test'
            }
        }
        stage ('Install Stage') {
            steps {
                    bat 'mvn install'
            }
        }
    }
}