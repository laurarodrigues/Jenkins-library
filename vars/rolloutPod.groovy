def call(String pod){
    sh "kubectl rollout status deployment ${pod} --kubeconfig=./kubeconfig"
}