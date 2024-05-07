

public class ApplicationFiles{

    private String propertiesFile;


    public ApplicationFiles(String propertiesFile){
        this.propertiesFile = propertiesFile;
    }

    public String property(String property){
       
        String deployFile;
        String[] lines = propertiesFile.split(System.lineSeparator());
        for(int i = 0; i<lines.length; i++){
            if(lines[i].contains(property)){
                deployFile = lines[i+1];
            }
        }
        return deployFile;

    }

    
}

