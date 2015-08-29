Software Requirements List:
> BPM:
> > IBM BPM v 8.0
> > IBM Process Designer (Lombardi v 8.0)

> Cognos:
> > IBM Cognos v 10.2

> SME:
> > springsource-tool-suite-2.9.2.RELEASE-e3.7.2-win32-installer
> > grails-1.3.7
> > MySql v 5.2 CE

> CEP:
> > IBM WebSphere v 7.0.1

> Message Broker & Test Console:
> > WebSphere Message Broker Toolkit v 8.0

Required URLs: (Must be connected to the university network)

> SME Console: http://137.122.93.228:8080/SME/
> Cognos: http://137.122.93.90/ibmcognos/
> Message Broker: http://137.122.88.139:8080/osler-mb/
> BPM Web Console: http://137.122.93.132:9080/portal/
> Ekahau Console: http://137.122.88.139:8550/epe/main/

Starting the BPM Server:
> Use the Remote Desktop tool to connect to the url 137.122.93.132 (You must be connected to the university network).
> user: Lpeyton Pass: Liam is my professor in 2012 at U of O
> C:\IBM\BPM\v8.0\profiles\ProcCtr01?\bin
> check BPM server is running, go to the location above from the command line running as administrator, then type serverStatus.bat server1
> to start server type: startServer.bat server1
> start the BPM client. go to where the client is installed and edit the file eclipse.init.
> http://137.122.93.132:9080/portal to check BPM server from browser.
> if not working, try connecting to robolab w1r3l3ss!
> username and passwrd are admin admin
> change the following in the eclipse.init file. url=http://oslerbpm.site.uottawa.ca:9080
> (this did not work and we went back to the ip)
> ALWAYS USE ROBOLAB WIRELESS NETWORK.
> to connect to the BPM sever at the standalone use the : url=http://192.168.1.135:9080

Starting Cognos:
> Use the Remote Desktop tool to connect to the url 137.122.93.90 (You must be connected to the university network).
> user: Lpeyton Pass: Liam is my professor in 2012 at U of O
> Press start and run the Cognos Configuration Manager
> Press the green triangle at the top left (play button)
> Wait 2-3 minutes for cognos to start
> navigate to the url http://137.122.93.90/ibmcognos to ensure it is live

Starting SME:
> Use the Remote Desktop tool to connect to the url 137.122.93.228 (You must be connected to the university network).
> user: Administrator Pass: Exam!23
> Navigate to the folder C:\PFM\apache-tomcat-7.0.23\bin
> Run the startup.bat file
> Navigate to URL http://137.122.93.228:8080/SME/ to verify the server has started

Starting CEP:
> Remote Desktop into the Server IP 137.122.93.228 for school network. (For the standalone: 192.168.1.134)
> Enter log in credentials Username: Administrator, Password: Exam!23
> 2.Go to Start -> Programs -> IBM WebSphere? Business Events Server v7.0.1 and click on “Business Space”
> 3.On the login pop-up screen enter the credentials Username: aladdin\_baarah, Password:2611
> 4.Click on “Manage Spaces” tab and delete the existing projects space by clicking on “Actions” and Delete.
> 5.Create a new space, give it a name e.g. “Osler Demo”, “save” and click “Done”.
> 6.Click on the “Spaces” tab and select your newly created space from the list.
> 7.Click on “Edit Page”
> 8.Click on “Business Events Design” and “Business Events Tester” Widgets to add them to the Project.
> 9.In the “Business Events Design” Widget, Click on Project -> Open
> > Choose Folder Shirely and
> > Click on Osler Extended Scenario\_v4(Demo)
> > Click on OK
> > Wait until you receive confirmatory message “Project opened successfully”
> > Go to Runtime tab and click on “Delete repository assets”
> > Go to Runtime tab again and click on “Publish to Runtime”
> > Wait until you receive confirmatory message “Publishing project: published successfully”

> Note: (If you face with this Error: Error 404: ProxyServlet?: /mum/nullassets , you can close the project and comeback to step 8)
  1. . In the “Business Events Tester” Widget, Click on “Restart Testing” button
  1. .In the file system navigate to C:\OslerProject\TestCase1\InputEvents folder
> > Empty the folder if it contains any files
  1. .Go to Start -> Programs -> IBM WebSphere Business Events Server v7.0.1 and click on “Connectors”
  1. .On the login pop-up screen enter the credentials
> > User Identity: aladdin\_baarah,
> > User Password:2611
> > Click on OK
  1. .The CEP is now ready to receive events.

Starting Message Broker:

> Use the Remote Desktop tool to connect to the url 137.122.88.139 (You must be connected to the university network).
> user: Administrator Pass: Liam is my professor in 2012 at U of O
> Navigate to the folder C:\tomcat7\bin
> Right click on tomcat7w.exe and click on "Run in administrator mode"
> Click the "start" button
> Navigate to URL http://137.122.88.139:8080/osler-mb/ to verify the server has started

