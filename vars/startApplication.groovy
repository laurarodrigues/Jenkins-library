def call(String databasePod){
    def appFile = new ApplicationFiles();
    String deployFileApp = appFile.getProperty("deployment.database");
    applyDeployment(deployFileApp)
    rolloutPod("postgres")
    String deployFileDB = appFile.getProperty("deployment.application");
    applyDeployment(deployFileDB)
}