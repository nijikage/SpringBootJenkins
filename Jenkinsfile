@Library(["piper-os"]) _

pipeline {
    agent any

    tools {
        maven 'maven'
        jdk 'Java17'
    }

    stages {
        stage("Init") {
            steps {
                setupCommonPipelineEnvironment(script: this)
            }
        }

        stage("Build") {
            steps {
                sh "mvn clean compile"
            }
        }

        stage("Test") {
            steps {
                sh "mvn test"
            }
        }

        stage("Buildpacks") {
             steps {
                sh 'pack build my-spring-boot-image --buildpack buildpack.yml'
            }
        }

        stage("Deploy to Production") {
            steps {
                input message: 'Do you want to deploy to production?', id: 'deploy_to_prod', ok: 'Yes'
                echo "deeeeeeeploooooy to production"
            }
        }
    }
}