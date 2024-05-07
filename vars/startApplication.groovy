def call(String databasePod){
    def propertiesFile = libraryResource "application_1.properties";
    //sh "echo Datei mit Deployments"
    sh "echo ${propertiesFile}"
    sh "echo --------"
    sh "echo Klasse ApplicationFile wird instanziert"
    def appFile = new ApplicationFiles(propertiesFile);
    sh "echo Deployment-Datei für DB wird gesucht"
    String deployFileApp = appFile.property("database");
    sh "echo gefunden ${deployFileApp}"
    applyDeployment(deployFileApp)
    rolloutPod("postgres")
    String deployFileDB = appFile.property("application");
    applyDeployment(deployFileDB)
}