def call(String deployment){
    sh "kubectl apply -f ${deployment} --kubeconfig=./kubeconfig"
}