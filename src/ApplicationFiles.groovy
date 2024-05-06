public class ApplicationFiles{

    private Properties properties = new Properties();
    private FileReader reader
    private String applicationDeploy;
    private String databaseDeploy;

    public StartApplication(String applicationProperties){
        this.reader  = new FileReader(applicationProperties);
    }

    public String getApplicationDeploy(){
        properties.load(reader);
        return properties.getProperty("deployment.application"); 
    }

    public String getDataBaseDeploy(){
        properties.load(reader);
        return properties.getProperty("deployment.database"); 
    }
}