def call(String databasePod){
    ApplicationFiles applicationFile = new ApplicationFiles("application.properties");

    applyDeploment(applicationFile.getApplicationDeploy())
    rolloutPod(databasePod)
    applyDeployment(applicationFile.getDataBaseDeploy())
}