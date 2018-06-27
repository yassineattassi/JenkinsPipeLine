
pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '9cae0606-0c73-45c5-ae72-6640a8d6fb31', url: 'https://github.com/gabrielf/maven-samples.git']]])
            }
        }
        stage('Test') { 
            steps {
                echo 'Test' 
            }
        }
        stage('Deploy') { 
            steps {
                 echo 'Deploy'
            }
        }
    }
}
