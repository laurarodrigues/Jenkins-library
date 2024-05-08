def call(){
     def newImage = sh(script: 'docker manifest inspect lauraped/bigstart:latest', returnStdout: true)
    echo "${newImage}"
    if(newImage == null){
        sh 'docker build -t lauraped/bigstart:latest .'
        sh 'docker push lauraped/bigstart:latest' 
    }
}