

public class ApplicationFiles{

    private String propertiesFile;


    public ApplicationFiles(String propertiesFile){
        this.propertiesFile = propertiesFile;
    }

    public String getProperty(String property){
       
        String deployFile;
        BufferedReader reader;

        try{
            reader = new BufferedReader(new FileReader(propertiesFile));
            String line =reader.readLine();

            while(line != null){
                if(line.contains(property)){
                    String[] result = line.split("=");
                    deployFile = result[1];
                }
            }


        }catch(IOException e){
            e.printStrackTrace();
        }

        return deployFile;
    }

    
}

