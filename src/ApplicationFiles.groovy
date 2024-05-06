public class ApplicationFiles{

    private Properties properties = new Properties();
    private FileReader reader
    private String applicationDeploy;
    private String databaseDeploy;

    public ApplicationFiles(String applicationProperties){
        //this.reader  = new FileReader(applicationProperties);
         InputStream in = this.getClass().getClassLoader().getResourceAsStream("application.properties");
    }

    public String getApplicationDeploy(){
        properties.load(in);
        return properties.getProperty("deployment.application"); 
    }

    public String getDataBaseDeploy(){
        properties.load(in);
        return properties.getProperty("deployment.database"); 
    }
}