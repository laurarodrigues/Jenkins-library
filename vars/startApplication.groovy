def call(String databasePod){
    def propertiesFile = libraryResource "application.properties";
    def appFile = new ApplicationFiles(String propertiesFile);
    String deployFileApp = appFile.getProperty("deployment.database");
    applyDeployment(deployFileApp)
    rolloutPod("postgres")
    String deployFileDB = appFile.getProperty("deployment.application");
    applyDeployment(deployFileDB)
}