def call(String databasePod){
    ApplicationFiles applicationFile = new ApplicationFiles();
    String deployFileApp = applicationFile.getProperty("deployment.database");
    applyDeployment(deployFileApp)
    rolloutPod("postgres")
    String deployFileDB = applicationFile.getProperty("deployment.application");
    applyDeployment(deployFileDB)
}