pipeline{
    agent any
    stages{
        stage('Git clone'){
            steps{
               git https://github.com/TmaThinhNguyen/spring-jenkins
            }
        }
        stage('Create Dockerimage'){
            steps{
                sh 'docker build -t thetips4you/springboot:latest .'
            }
        }
    }
}