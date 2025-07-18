
def call() {
    echo " Starting build step"
    sh 'mvn clean package'
    echo " Build completed"
}
