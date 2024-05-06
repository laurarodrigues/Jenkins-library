def call(Map config, String pod){
    sh "kubectl rollout status deployment ${pod} --kubeconfig=${config.credentials}"
}