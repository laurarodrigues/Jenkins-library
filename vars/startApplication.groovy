def call(String databasePod){
    ApplicationFiles applicationFile = new ApplicationFiles("/resources/application.properties");

    applyDeploment(applicationFile.getApplicationDeploy())
    rolloutPod(databasePod)
    applyDeployment(applicationFile.getDataBaseDeploy())
}