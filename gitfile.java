//Procedure of remote adding repo
//git init adding .git into directory -- turning regular into git repo
//git add *.java (staged all java files--source files)
//or create .gitignore(All files format) (has *.class) so to ignore all class file but .gitignore when tracking files
//git remote add origin git@github.com:xzrRyan/lecture-5.git     link our git directory with github repo 
//git branch -M main;  by convention, default branch is main or master-- make sure file branch same for github and local computer
//git push -u origin main:  push all files in local repo to github repo
//(find repo in github desktop)
public class gitfile {
    public static int countWords(String sentence){
        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                spaceCount++;
            }
        }
        return spaceCount + 1;
    }
}
/* indentation is key for markup languages, just as colon
//continuous integration: 
//we setup a workflow(in Actions): create main.yml(YAML-- yet anothrt markup language)
//whenever push commits to repo, trigger workflow's build(running Junit test)

//(whole file define a workflow)
# This is a basic workflow to help you get started with Actions

name: CI //continuous integration

//<on> == if()
# Controls when the workflow will run
on:
  # Triggers the workflow on push or pull request events but only for the main branch
  push:
     //only for main branch
    branches: [ main ]
  pull_request:
    branches: [ main ]

  # Allows you to run this workflow manually from the Actions tab
  workflow_dispatch:

//<job> to do when if == true
# A workflow run is made up of one or more jobs that can run sequentially or in parallel
jobs:
  //one default job called <build>
  # This workflow contains a single job called "build"
  build:
    //which operating system to chose when running on server
    # The type of runner that the job will run on
    runs-on: ubuntu-latest

    # Steps represent a sequence of tasks that will be executed as part of the job
    steps:
      # Checks-out your repository under $GITHUB_WORKSPACE, so your job can access it
      // - similar as bullet point
      - uses: actions/checkout@v3 //clone current repo

      # Runs a single command using the runners shell
      - name: Run a one-line script
        run: echo Hello, world!

      # Runs a set of commands using the runners shell
      - name: Run Junit test    //changing name
        run:
          javac -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar <methodfile><testingfile>
          java -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:.org.junit.runner.JunitCore <testingfile>

*/

//by convention: 0 exit code -- success;  non-zero code -- error in program
//$? : previous command code; we must print it with <echo>