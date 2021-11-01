git commands
configure git -Setting username and email
$ git init

$ git config --global   user.name "sunilkumark11"
$ git config --global   user.email  "sunilkumark11@gmail.com"
 TO check the configurations
$ git config  --global  --list
  
1. git init -to convert folder in working directory
2. git status -it shows the status of file like untracked/staging area/local repository
3. git add filename -to move file from untracked to the staging area
4. git add. - to move all the files togetherly
5. git commit -m "any message"- to move the files from staging area to local repository