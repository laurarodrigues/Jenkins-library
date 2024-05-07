

public class ApplicationFiles{

    private String propertiesFile;


    public ApplicationFiles(String propertiesFile){
        this.propertiesFile = propertiesFile;
    }

    public String property(String property){
       
        String deployFile;
        BufferedReader reader;

        try{
            reader = new BufferedReader(new FileReader(propertiesFile));
            String line =reader.readLine();

            while(line != null){
                System.out.println(line);
                if(line.contains(property)){
                    String[] result = line.split("=");
                    deployFile = result[1];
                }
                line = reader.readLine();
            }


        }catch(IOException e){
            e.printStrackTrace();
        }

        return deployFile;
    }

    
}

