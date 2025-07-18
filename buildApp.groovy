
def call() {
    echo " Starting build step"
    sh 'mvn clean install'
    echo " Build completed"
}
