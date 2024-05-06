def call(String deployment){
    sh "kubectl delete ${deployment} bigstart -n default --kubeconfig=./kubeconfig"
}