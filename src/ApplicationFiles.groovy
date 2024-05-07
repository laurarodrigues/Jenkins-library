

public class ApplicationFiles{

    private String propertiesFile;


    public ApplicationFiles(String propertiesFile){
        this.propertiesFile = propertiesFile;
    }

    public String property(String property){
       
        String deployFile;
        BufferedReader reader;
        System.out.println("Test");
         System.out.println(propertiesFile);

        try{
            reader = new BufferedReader(new FileReader(propertiesFile));
            System.out.println("Test");
            String line =reader.readLine();
            boolean durchlaufen = false;

            while(line != null){
                System.out.println("Test" + line);
                if(line.contains(property)){
                    String[] result = line.split("=");
                     durchlaufen = true;
                    deployFile = result[1];
                }
                line = reader.readLine();
            }


        }catch(IOException e){
            e.printStackTrace();
        }

        if(durchlaufen){
            return "true";
        }else{
                return "false";
                
        }

    }

    
}

