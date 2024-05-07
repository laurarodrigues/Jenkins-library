

public class ApplicationFiles{

    String propertiesFile


    public ApplicationFiles(String propertiesFile){
        this.propertiesFile = propertiesFile;
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

