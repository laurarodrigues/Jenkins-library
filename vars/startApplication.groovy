def call(String databasePod){
    def propertiesFile = libraryResource "application.properties";
    sh "echo Datei mit Deployments ${propertiesFile}"
    def appFile = new ApplicationFiles(propertiesFile);
    
    String deployFileApp = appFile.property("deployment.database");
    sh "echo gefunden ${deployFileApp}"
    applyDeployment(deployFileApp)
    rolloutPod("postgres")
    String deployFileDB = appFile.property("deployment.application");
    applyDeployment(deployFileDB)
}