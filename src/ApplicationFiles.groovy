

public class ApplicationFiles{

    private String propertiesFile;


    public ApplicationFiles(String propertiesFile){
        this.propertiesFile = propertiesFile;
    }

    public String property(String property){
       
        String deployFile;
        Scanner sc = new Scanner(propertiesFile);
        while(sc.hasNext()){
            if(sc.next().contains(property)){
                deployFile = sc.next();
            }
        }
        return deployFile;

        

        

    }

    
}

