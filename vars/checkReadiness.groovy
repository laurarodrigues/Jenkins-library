def call(String ip){
    def readiness_response = sh(script: "curl http://${ip}/actuator/health/liveness")
    echo "${readiness_response}"
}