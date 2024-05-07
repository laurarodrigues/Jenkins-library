def propertiesFile = libraryResource "application.properties"

public class ApplicationFiles{


    //public ApplicationFiles(){
    //}

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

