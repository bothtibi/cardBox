node {

  stage 'build'
  def mvn_version = 'M3'
  withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
    sh "${mvnHome}/bin/mvn clean install"
  }




  stage 'create docker image'

  sh "${mvnHome}/bin/mvn clean package docker:build"

  stage 'start the container'

  sh "docker run -p 8888:8888 -t cardbox/cardbox"
}