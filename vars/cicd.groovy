def gitDownload(repo)
{
    git "https://github.com/303145/${repo}.git"
}

def buildArtifact()
{
    sh 'mvn package'
}

def deployTomcat(jobname,IP,contextpath)
{
     sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${IP}:/var/lib/tomcat10/webapps/${contextpath}.war"
}

def runSelinium(jobname)
{
    sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}



