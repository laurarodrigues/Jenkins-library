def call(String ip){
       //def get = new URL(${ip}).openConnection();
        def get = new URL("http://10.105.136.231:80").openConnection();
       
            def getRC = get.getResponseCode();
            println(getRC);
            if(getRC.equals(200)){
                println(get.getInputStream().getText());
            } 
}