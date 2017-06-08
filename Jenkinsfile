node {

  stage 'build'
  def mvnHome = tool 'maven-3.3.9'

  sh "${mvnHome}/bin/mvn clean install"


  stage 'create docker image'

  sh "${mvnHome}/bin/mvn clean package docker:build"

  stage 'start the container'

  sh "docker run -p 8888:8888 -t cardbox/cardbox"
}