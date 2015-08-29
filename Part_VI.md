# Introduction #

## Exercise 6.1 : Overview of the database ##
We will show how to go from the Database to Reports and dashboards.
Remote connect to the url 137.122.93.90 using the lombardi password.

Open the MS Sql Server Management Studio and open the pfmv4 database. In the Database Diagram folder, open dbo\_diagram\_0. In this diagram, there are the following tables:
patient\_event\_fact
patient\_state\_fact

## Exercise 6.2 : Importing the db into framework manager ##

![http://i.imgur.com/aTqkfQm.png](http://i.imgur.com/aTqkfQm.png)


Now, we must use this database, and configure IBM Cognos to connect to it. To do this, we must use the IBM Administration portal. This is located at the url http://137.122.93.90/ibmcognos . This url MUST be opened using Internet Explorer. Once the console shows up, click on the administration link. This will open up the status and health page of cognos for configuration. This is not important for us right now. Navigate to the "Configuration" tab as seen below.
![http://i.imgur.com/s5zQo7y.png](http://i.imgur.com/s5zQo7y.png)

This portal shows all of the current database connections that are available to you in cognos. We must now create a new connection to allow us to connect to  our new database "TestDatabaseBPM". In the top left corner you will see a cylinder with a star beside it. This is the new data source button. Click it, and it will bring you to the next menu below:

![http://i.imgur.com/KMiVpua.png](http://i.imgur.com/KMiVpua.png)

This page allows you to specify what the source data program is used. For example, if the database is a Microsoft Access database, the dropdown here will have Microsoft Access selected. In this case, we are using Microsoft SQL Server 2008.

The next few images show a detailed description of how to configure the connection to the SQL Server, and how to specify which database to connect to. The username and password is located in dropbox under Osler Project/Virtual Server List.xlsx->WAS-Cognos sheet

![http://i.imgur.com/O6E5jTi.png](http://i.imgur.com/O6E5jTi.png)

Enter in the primary credentials of the server. This step seems to not have any impact, the only fields that are needed are the database username and password.

![http://i.imgur.com/9P1ZNyS.png](http://i.imgur.com/9P1ZNyS.png)

Enter the secondary credentials to the database. This step must have the correct information, and testing of the connection string is crucial.

![http://i.imgur.com/RnpNFxV.png](http://i.imgur.com/RnpNFxV.png)

This is the testing of the connection portal. Verify the username and password and click test. Upon a successful connection, this screen will show.

![http://i.imgur.com/hV9KhGq.png](http://i.imgur.com/hV9KhGq.png)

Once you reach the step above, you have finished configuring the connection, and it is now available for IBM Framework manager. To use IBM Framework Manager, you must be on the university network, and remote desktop to the IP 137.122.93.90  . Once you have logged on using the configuration described in the Virtual Server List.xlsx, press start and click on IBM Framework Manager

![http://i.imgur.com/w0lDumf.png](http://i.imgur.com/w0lDumf.png)

Here, we will add the Data Source that was configured in the last couple steps. Follow the steps of the images below to create a project, and add the data connection to it.

![http://i.imgur.com/VPAoZ7o.png](http://i.imgur.com/VPAoZ7o.png)

This is the initial screen for creating a project. Give it a meaningful name, or the same name as your database, then hit OK.

![http://i.imgur.com/aIbcfec.png](http://i.imgur.com/aIbcfec.png)

Select what data source to use. Since we just configured a data source using the IBM Admisistrator tab, this is the option we will use.

![http://i.imgur.com/hrIxzuh.png](http://i.imgur.com/hrIxzuh.png)

This step automatically calls the IBM service and queries for the available data sources that have been configured. You should see your data source here near the bottom.

![http://i.imgur.com/OQ5Qum7.png](http://i.imgur.com/OQ5Qum7.png)

The selected data source is queried further to get the schema. You can import all of the available database schema, or only selected parts of it if you wish. The most important of course is the tables. The bottom check box only applies if there are tables in your connection with the same name.

![http://i.imgur.com/F04Mqwq.png](http://i.imgur.com/F04Mqwq.png)

Lastly, specify how the database will be queried. The default options here are fine.

![http://i.imgur.com/bgQo3Jz.png](http://i.imgur.com/bgQo3Jz.png)

Now you are done! You can proceed to Exercise 6.3 to add dimensions, fact calculations, and hierarchies.

## Exercise 6.3 : Creating source, logical and dimensional views ##

In this section, we will modify our tables so that Cognos can easily run calculations, OLAP cubes, and drill functions.

First, however, lets verify that Framework Manager has successful pulled the correct database from the Data Source by running a test. This can be done by double clicking one of the tables, and running the test in the test tab. An example is seen below.

![http://i.imgur.com/hcVfLoi.png](http://i.imgur.com/hcVfLoi.png)

This is done using logical and dimensional views, which allow the user to make slight modifications to the facts and dimensions without changing the source tables. The image below shows how to create the three view that are required to add these special functionality.

![http://i.imgur.com/mjNX9ic.png](http://i.imgur.com/mjNX9ic.png)

Once this step is completed, you should have a source view with all of the original tables in it (can be done with drag and drop), and two empty views for Logical and Dimensional tables.

Next, we will copy all of the tables, and paste them into logical so we can start making some calculations. Calculations are useful for fact tables that have state data that can be calculated using other columns. This step will help Cognos get parsable information easily, as the values are precalculated before they are reported on. For example, if there is a column of monthly sales, a logical column could be calculated as weekly sales, which would be the monthly sales column divided by 4. Below is just some example syntax of a calculation on the test table.
![http://i.imgur.com/OowFKLl.png](http://i.imgur.com/OowFKLl.png)

Lastly, we are going to flesh out our dimensional model. First, copy all of the tables from the logical view, and paste them in the dimensional view. Next, we will define each of the dimensional tables by right clicking them and clicking Merge in New Regular Dimension.

Now, you have to define each level of the hierarchy. A hierarchy is defined by how many unique values are in each of the rows of the dimension. For example, an Address dimension would have many duplicates for country, but slightly less duplicate city rows. This means that the country column is higher up in the hierarchy. The very top of the hierarchy should be <Name of dim>(All), and the very bottom should be the unique identifier of each row. The image below shows a simple example of a dimensional hierarchy.
![http://i.imgur.com/CVt6m5Q.png](http://i.imgur.com/CVt6m5Q.png)

Now you are done creating your framework manager package. All that is left is to deploy it to Cognos to start authoring reports.

## Exercise 6.4 : Creating and deploying framework package ##

A framework package combines all views, calculations, and dimensions that have been configured, and versions them so they are available for cognos reporting. The version is important because certain reports may rely on a different configuration in framework manager, and updates could break the report. This way, different reports can work with different views of the database, and have a clear upgrading schedule. First, a package must be created as described in the step below.

![http://i.imgur.com/femiQ9b.png](http://i.imgur.com/femiQ9b.png)

This will prompt you for a package name. Since the version number is built into the package, the name does not have to be unique for every time you create a package. Next, you are prompted to choose which views should be inserted into the package. In this case we want all of them as described below.

![http://i.imgur.com/OrN1twc.png](http://i.imgur.com/OrN1twc.png)

The next couple steps are very straight forward, and the configuration only needs to be changed if including security, or to allow for static reports. The focus of this tutorial is just a general introduction however, so the intricacies are not important.

![http://i.imgur.com/TJiFzYy.png](http://i.imgur.com/TJiFzYy.png)
![http://i.imgur.com/C4uinBS.png](http://i.imgur.com/C4uinBS.png)
![http://i.imgur.com/i7MHwl2.png](http://i.imgur.com/i7MHwl2.png)

This last step is the most important, as this is the first time throughout the process that you are prompted to validate your configuration to make sure there are no inconsistencies or errors. Since there are many steps in the process, there is often something that goes wrong during the first attempts of validation.

The most complex step that requires much customization is the definition of the hierarchies. Often this is the source of the problem. For the first pass, it may be better to start with a very simple hierarchy just to try some preliminary reporting before getting into the detail of drilling and filtering.

![http://i.imgur.com/ODyGFNO.png](http://i.imgur.com/ODyGFNO.png)

Now your package has been published! It will be available on the Cognos portal for report studio.

## Exercise 6.5 : Creating reports in Cognos - Report Studio ##
You must complete these steps on Internet Explorer.

To access Cognos report studio, open the following link in IE: 137.122.93.90/ibmcognos