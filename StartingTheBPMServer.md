Use the Remote Desktop tool to connect to the url 137.122.93.132 (You must be connected to the university network).

user: Lpeyton
Pass: Liam is my professor in 2012 at U of O


C:\IBM\BPM\v8.0\profiles\ProcCtr01\bin

check BPM server is running, go to the location above from the command line running as administrator,
then type serverStatus.bat server1

to start server type: startServer.bat server1

start the BPM client.
go to where the client is installed and edit the file eclipse.init.


http://137.122.93.132:9080/portal
to check BPM server from browser.

if not working, try connecting to robolab
w1r3l3ss!

username and passwrd are admin admin

change the following in the eclipse.init file.
url=http://oslerbpm.site.uottawa.ca:9080
> (this did not work and we went back to the ip)

ALWAYS USE ROBOLAB WIRELESS NETWORK.

to connect to the BPM sever at the standalone use the : url=http://192.168.1.135:9080