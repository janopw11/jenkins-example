pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // Run Maven on a Unix agent.
                sh "mvn clean compile" // przebudowanie projektu
            }

        }

        stage('Test') {
                    steps {
                        // Run Maven on a Unix agent.
                        sh "mvn test" // przebudowanie projektu
                    }

                }

                stage('Deploy') {
                            steps {
                                // Run Maven on a Unix agent.
                                sh "mvn clean heroku:deploy" // przebudowanie projektu
                            }

                        }
    }
}
