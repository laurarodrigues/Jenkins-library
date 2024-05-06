def call(String ip){
       def get = new URL("http://" ${ip}).openConnection();
       
            def getRC = get.getResponseCode();
            println(getRC);
            if(getRC.equals(200)){
                println(get.getInputStream().getText());
            } 
}