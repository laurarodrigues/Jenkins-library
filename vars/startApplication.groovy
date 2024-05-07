def call(String databasePod){
    def propertiesFile = libraryResource "application.properties";
    //sh "echo Datei mit Deployments"
    //sh "echo ${propertiesFile}"
    sh "echo --------"
    sh "echo Klasse ApplicationFile wird instanziert"
    def appFile = new ApplicationFiles(propertiesFile);
    sh "echo Deployment-Datei für DB wird gesucht"
    String deployFileApp = appFile.property("deployment.database");
    sh "echo gefunden ${deployFileApp}"
    applyDeployment(deployFileApp)
    rolloutPod("postgres")
    String deployFileDB = appFile.property("deployment.application");
    applyDeployment(deployFileDB)
}