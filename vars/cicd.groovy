def gitDownload(repo)
{
    git "https://github.com/303145/${repo}.git"
}

def buildArtifact()
{
    sh 'mvn package'
}

