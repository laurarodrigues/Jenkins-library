def call(String databasePod){
    //ApplicationFiles applicationFile = new ApplicationFiles();
    def propertiesFile = libraryResource "application.properties"
    echo ${propertiesFile}

    applyDeploment("deployment-app.yaml")
    rolloutPod("postgres")
    applyDeployment("bigstart")
}