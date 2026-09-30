pipeline {
agent any

stages {

stage(&#39;Checkout&#39;) {
steps {
checkout scm
}
}

stage(&#39;SonarQube Analysis&#39;) {
steps {
script {
def scannerHome = tool &#39;SonarScanner&#39;

withSonarQubeEnv(&#39;SonarQube&#39;) {
sh &quot;${scannerHome}/bin/sonar-scanner&quot;
}
}
}
}
}
}
