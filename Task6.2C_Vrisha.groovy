pipeline {

    agent any

    stages {
        stage('Build') {
            steps{
                echo "Building..."
            }
        }
        post {
            success {
                mail to: "vcooblall2021@gmail.com",
                subject: "Build Status Email",
                body: "Build was successful!"
            }
        }
        
        stage('Unit and Integration Tests') {
            steps {
                echo "Running unit and integration tests..."
            }
            post {
                success {
                    mail to: "vcooblall2021@gmail.com",
                    subject: "Running unit and integration tests Status Email",
                    body: "Running unit and integration tests was successful!"
                }
            }           
        }
        
        stage('Code Analysis') {
            steps {
                echo "Analyzing the code..."
            }
            post {
                success {
                    mail to: "vcooblall2021@gmail.com",
                    subject: "Code Analysis Status Email",
                    body: "Code Analysis was successful!"
                }
            } 
        }
        
        stage('Security Scan') {
            steps {
                echo "Scanning for security vulnerabilities..."
            }
            post {
                success {
                    mail to: "vcooblall2021@gmail.com",
                    subject: "Security Scan Status Email",
                    body: "Security Scan was successful!"
                }
            }          
        }
        
        stage('Deploy to Staging') {
            steps {
                echo "Deploying to staging..."
            }
            post {
                success {
                    mail to: "vcooblall2021@gmail.com",
                    subject: "Deploy to Staging Status Email",
                    body: "Deploy to Staging was successful!"
                }
            } 
        }
        
        stage('Integration Tests on Staging') {
            steps {
                echo "Running integration tests on staging..."
            }
            post {
                success {
                    mail to: "vcooblall2021@gmail.com",
                    subject: "Integration Tests on Staging Status Email",
                    body: "Integration Tests on Staging was successful!"
                }
            } 
        }
        
        stage('Deploy to Production') {
            steps {
                echo "Deploying to production..."
            }
            post {
                success {
                    mail to: "vcooblall2021@gmail.com",
                    subject: "Build Status Email",
                    body: "Build was successful!"
                }
            } 
        }
    
    }
}