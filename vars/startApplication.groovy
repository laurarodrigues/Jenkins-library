def call(String databasePod){
    def propertiesFile = libraryResource "application.properties";
    def appFile = new ApplicationFiles(propertiesFile);
    String deployFileApp = appFile.property("deployment.database");
    applyDeployment(deployFileApp)
    rolloutPod("postgres")
    String deployFileDB = appFile.property("deployment.application");
    applyDeployment(deployFileDB)
}