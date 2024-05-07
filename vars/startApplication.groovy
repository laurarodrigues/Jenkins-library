def call(String databasePod){
    ApplicationFiles applicationFile = new ApplicationFiles();
    String deployFile = applicationFile.getProperty("deployment.database");
    applyDeployment(deployFile)
    rolloutPod("postgres")
    String deployFile = applicationFile.getProperty("deployment.application");
    applyDeployment(deployFile)
}