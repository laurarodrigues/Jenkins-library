def call(String databasePod){
    def propertiesFile = libraryResource "application.properties";
    sh "echo ${propertiesFile}"
    def appFile = new ApplicationFiles(propertiesFile);
    sh "echo ${appFile}"
    String deployFileApp = appFile.property("deployment.database");
    applyDeployment(deployFileApp)
    rolloutPod("postgres")
    String deployFileDB = appFile.property("deployment.application");
    applyDeployment(deployFileDB)
}