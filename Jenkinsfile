node {

  stage 'build'

  sh "mvn clean install"


  stage 'create docker image'

  sh "mvn clean package docker:build"

  stage 'start the container'

  sh "docker run -p 8888:8888 -t cardbox/cardbox"
}