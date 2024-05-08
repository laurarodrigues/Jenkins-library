def call(){
   echo "Checking out"
   checkout([$class: 'GitSCM', branches: [[name: '*/master']], userRemoteConfigs: [[url: 'https://github.com/laurarodrigues/Demo-Spring-mvc-2.git']]]) 
}