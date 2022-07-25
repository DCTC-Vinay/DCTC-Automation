1. Download Jenkins from https://www.jenkins.io/download/
2. Click on Generic Java Package (.war) any version
2. Go to the Jenkins folder and Open command Prompt
3. Install using a command 
	Java –jar Jenkins.war
4. Download Tomcat Binary Distribution from https://tomcat.apache.org/download-90.cgi
5. Go to Core --> 32 bit or 64 bit windows zip
6. Copy jenkins.war file and paste in apache tomcat/webapps folder
7. Go to C:\Users\ip-slim-3\.jenkins and open config.xml file in Notepad change userSecurity to false
8. Go to Apache Tomcat/config/tomcat-users.xml and open notepad
9. Add user as <user username="tomcat" password="admin" roles="manager-gui"/>
10. Now Go to Apache bin folder ---> Open the cmd
11. Type command as startup.bat
12. Go to browser and type localhost:8080/jenkins
13. Go to Manage Jenkins ---> Scroll down and Click on Manage Plugins
14. Search for Git plugin ---> Click on restart after install button at bottom
15. 