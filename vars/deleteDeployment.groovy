def call(String deployment){
    sh "kubectl delete ${deployment} -n default --kubeconfig=./kubeconfig"
}