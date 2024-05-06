def call(String ip){
    def liveness_response = sh(script: "curl http://${ip}/actuator/health/liveness")
    echo "${liveness_response}"
}