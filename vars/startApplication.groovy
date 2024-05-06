def call(String databasePod){
    ApplicationFiles applicationFile = new ApplicationFiles();

    applyDeploment(applicationFile.getApplicationDeploy())
    rolloutPod(databasePod)
    applyDeployment(applicationFile.getDataBaseDeploy())
}