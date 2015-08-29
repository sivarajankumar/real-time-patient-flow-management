#Setting up the WebSphere Business Events

# Exercise X.X start and configure the CEP (WebSphere Business Events) #

Remote connect to this machine:
IP address of the machine: 137.122.93.228
User name: WIN-U8BMQ67RW9Y\Administrator
Password: Exam!23

Wait about 5 minutes.
Open the MSG Broker Console in your local machine or Laptop by typing the URL: http://137.122.88.139:8080/osler-mb/
The purpose of MSG Broker is to check that it logs all the events come from WBE.
It is a good way for troubleshooting.

Access again the VM that contains the WBE. You could do that by

Open the Business Space of WBE by clicking start>All Programs> WebSphere Business Events v7.0.1>Business Space.

Enter the User ID and the password
User ID: Aladdin\_baarah
Password: 2611
8.	Create a new space for the demo.
a.	Click the “Manage Space” text link in the top left of the page (if there is existing space, delete by clicking on actions, then delete).
b.	Click the “Create Space” button.
c.	Type the name of the space (i.e. OslerDemo) and hit save.
d.	Click “Done” button.

9.	Now you are in the OslerDemo space.

10.	Click “Go to Spaces” text link in the top left of the page and then choose the OslerDemo space.

11.	Click “Edit Page” button located at the center of the page.

12.	Drag two widgets onto the page from the palette, namely, Business Event Design and Business Events Tester.

13.	Add first the Business Events Design widget by clicking the “+” sign next to it.
a.	Click the “Project” menu and choose open.
b.	From the folder “Shirely” choose the project “OslerExtendedScenario\_V4(Demo)”.
c.	Click Ok.
d.	Click “Runtime” menu and choose “Delete repository assets” and then click OK
e.	Click again “Runtime” menu and hit “Publish to runtime”.

14.	Add the second widget “Business Events Tester” from the palette by clicking the “+” sign next to it.
a.	You have to restart testing by clicking “Restart testing” button.
15.	Before running the connectors, which listens to the events from the folder “C:\OslerProject\TestCase1\InputEvents” and write the actions (.XML file) in the folder “C:\PFM\apache-tomcat-7.0.23\webapps\PFM\xml” (files consumes by PFM and forwarder to MSG Broker), remove any files reside in the Input folder for the WBE located at “C:\OslerProject\TestCase1\InputEvents”.

16.	Run the connector by clicking start>All Programs> WebSphere Business Events v7.0.1> Connectors.
a.	You are asked to enter the user identity and user password.
User Identity:Aladdin\_baarah
User Password:2611

17.	Now, WBE is ready for receiving events, through the input folder “C:\OslerProject\TestCase1\InputEvents”, from RTLS and BPM.

18.	Make sure both the input folder “C:\OslerProject\TestCase1\InputEvents” and the output folder “C:\PFM\apache-tomcat-7.0.23\webapps\SME {or PFM}\xml” are open and they are in front of you.
-	This helps in monitoring input events to WBE and monitoring inferred events that goes to the output folder. NOTE: This is crucial for troubleshooting. See troubleshooting section.

19.	When WBE receives events from BPM or RTLS, it consumes those events from the input folder.
-	Double check the “Context Data” in the tab of the Business Events Tester widget which proofs that WBE receives the input event.

20.	When WBE generates an action (Inferred event), it writes that event (.xml) in the output folder “C:\PFM\apache-tomcat-7.0.23\webapps\PFM\xml”.
-	Double check the “Action” in the tab of Business Events Tester widget. You can see the desired output events there.
-	Click Refresh button inside the widget in case you couldn’t see the output.
-	Double check that the action is logged as well in the Console of the MSG Broker
a.	Go to the MSG Broker Console by typing the URL: http://137.122.88.139:8080/osler-mb/
b.	Under “Log Anaytics”, click “Incoming Log” text link.
c.	Refresh the page each time WBE generates the output event.

Starting the Java
1.	On the same machine, open command line as an administrator.
2.	Type java –jar RTLSEventManager.jar