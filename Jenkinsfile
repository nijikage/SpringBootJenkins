pipeline {
    agent any

    tools {
        maven 'maven'
        jdk 'java17'
    }

    stages {
        stage("Build") {
            steps {
                sh "mvn clean install"
            }
        }

        stage("Test") {
            steps {
                sh "mvn test"
            }
        }

        stage("Deploy to Production") {
            when {
                expression {
                    return env.BRANCH_NAME == "master"
                }
            }
            steps {
                input message: 'Do you want to deploy to production?', id: 'deploy_to_prod', ok: 'Yes'
                echo "deeeeeeeploooooy to production"
            }
        }
    }
}