def call(String databasePod){
    def propertiesFile = libraryResource "application_1.properties";
    def appFile = new ApplicationFiles(propertiesFile);
    String deployFileApp = appFile.property("database");
    applyDeployment(deployFileApp)
    rolloutPod(databasePod)
    String deployFileDB = appFile.property("application");
    applyDeployment(deployFileDB)
}