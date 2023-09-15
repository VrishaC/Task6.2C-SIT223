pipeline {

    agent any

    stages {
        stage('Build') {
            steps {
                echo "Building..."
            }

            post {
            success {
                mail to: "vcooblall2021@gmail.com",

                subject: "Build Status Email",

                body: "Build was successful!"
            }
            } 
        }    

        stage('Unit and Integration Tests') {
            steps {
                echo "Unit and integration tests..."
            }

            post {
                success {

                    mail to: "vcooblall2021@gmail.com",

                    subject: "Unit and integration tests Status Email",

                    body: "Unit and integration tests was successful!"

                }
            }          
        }

        stage('Code Analysis') {
            steps {
                echo "Code Analysis"
            }

            post {
                success {

                    mail to: "vcooblall2021@gmail.com",

                    subject: "Code Analysis Email",

                    body: "Code Analysis was successful!"

                }
            }
        }

        stage('Security Scan') {

            steps {
                echo "Security Scan"
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
                echo "Deploy to staging..."
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
                echo "Integration tests on staging..."
            }

            post {

                success {

                    mail to: "vcooblall2021@gmail.com",

                    subject: "Integration Tests Status Email",

                    body: "Integration Tests was successful!"

                }
            }
        }

        stage('Deploy to Production') {

            steps {
                echo "Deploy to production..."
            }

            post {
                success {
                    mail to: "vcooblall2021@gmail.com",

                    subject: "Deploy Status Email",

                    body: "Deploy was successful!"

                }
            }
        }
    }
}
