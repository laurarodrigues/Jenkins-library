def call(){
    sh  'echo $CA_CRT'
    sh 'rm -f ./kubeconfig'
                                
    sh 'cp $KUBECONFIG_SECRET ./kubeconfig'
    sh 'rm -f ./ca.crt'
    sh 'cp $CA_CRT ./ca.crt'
    sh 'rm -f ./client.crt'
    sh 'cp $CLIENT ./client.crt'
    sh 'rm -f ./client.key'
    sh 'cp $CLIENT_KEY ./client.key'
}