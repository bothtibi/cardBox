node {

    stage ('Checkout') {
        // checkout repository
        checkout scm

    }

    stage ('Build'){

        sh "mvn clean package docker:build"
    }


    stage ('Start the container'){

        sh "docker run -p 8888:8888 -t cardbox/cardbox"
    }
}

