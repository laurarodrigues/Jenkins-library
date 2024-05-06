def call(String databasePod){
    //ApplicationFiles applicationFile = new ApplicationFiles();
    def propertiesFile = libraryResource "application.properties"
    echo propertiesFile
    echo propertiesFiles.deployment.application

    applyDeployment("deployment-app.yaml")
    rolloutPod("postgres")
    applyDeployment("bigstart")
}