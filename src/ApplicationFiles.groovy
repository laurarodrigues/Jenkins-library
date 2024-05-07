import java.io.InputStream;

public class ApplicationFiles{

    private Properties properties = new Properties();
    private FileReader reader;
    private String applicationDeploy;
    private String databaseDeploy;

    public ApplicationFiles(){
    }

    public String getProperty(String property){
        String deployFile;
        Scanner scanner = new Scanner(propertiesFile);
        while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(lines.contains(property)){
                        String[] parts = lines.split("=");
                        deployFile = parts[1];
                }
                // process the line
        }
        scanner.close();

        return deployFile;
    }

    
}

def propertiesFile = libraryResource "application.properties"