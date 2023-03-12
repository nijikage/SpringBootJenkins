pipeline {
    agent 'buildpacks-agent'

    tools {
        maven 'maven'
        jdk 'Java17'
    }

    stages {
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
                sh 'pack build my-image --builder heroku/buildpacks --path .'
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