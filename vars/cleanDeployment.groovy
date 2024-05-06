def call(){
    def output = sh(script: "kubectl get deployments --kubeconfig=./kubeconfig", returnStdout: true)
    echo "Output: ${output}"
    if(output.contains("postgres")){
            deleteDeployment("postgres") 
            }
    if(output.contains("bigstart")){
            deleteDeployment("bigstart") 
            }
   
}