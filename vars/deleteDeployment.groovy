def call(String deployment){
    sh "kubectl delete deployment ${deployment} -n default --kubeconfig=./kubeconfig"
}