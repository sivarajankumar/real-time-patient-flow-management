## Task 4.4: Create the Interface using Coaches ##

> In this task, you will create the interface of the form that the patient will fill out when he/she arrives at the Checkin Activity.
## Procedure ##

1. First of all, navigate to the Clinical-Pathway Diagram and press on the **Checkin** activity.

2. In the **Checkin** activity properties, press on **implementation** and then on **New**. Enter **Checkin service** in the text field.The _Checkin service_ will show instead of the Default Human Service_._

> ![https://real-time-patient-flow-management.googlecode.com/svn/trunk/images/CheckinService.png](https://real-time-patient-flow-management.googlecode.com/svn/trunk/images/CheckinService.png)

3. Go to the Checkin activity in the diagram and double click on it.

4. Add a **couch** between the **start** and **end** event, name it **Checkin Coach**

> ![https://real-time-patient-flow-management.googlecode.com/svn/trunk/images/CheckinCoach.png](https://real-time-patient-flow-management.googlecode.com/svn/trunk/images/CheckinCoach.png)

5. Double click on the **Checkin Coach**.

6. From the palette on the right side, choose from **Section** > **Horizontal Section** drag and drop it in the diagram. Then, add three text fields from **Control** > **Text**. Change the names of the things you added to the diagram by clicking on the item and then changing the name in the properties of this specific item. Finally, add a button from **Control** > **button** and name it **Checkin**. The final interface should look like this:

> ![https://real-time-patient-flow-management.googlecode.com/svn/trunk/images/interface.png](https://real-time-patient-flow-management.googlecode.com/svn/trunk/images/interface.png)

7. Now you need to bind each text field with its related parameter in the **Patient** business object.

8. Go to **Variables** tab in the **Checkin service**, press on **Add Output** and Name the output **Patient**. Then, in the _Varaiable Type_, **select** the Patient business object that you created it earlier from the list and save what you did.

> ![https://real-time-patient-flow-management.googlecode.com/svn/trunk/images/patientOutput.png](https://real-time-patient-flow-management.googlecode.com/svn/trunk/images/patientOutput.png)

9. In Couches tab, Click on the First Name text field, then under behaviour in its General Properties click on **Select** in the **Binding** behaviour. Then, select **First Name** parameter in the Patient output you created earlier, as the following:

> ![https://real-time-patient-flow-management.googlecode.com/svn/trunk/images/binding.png](https://real-time-patient-flow-management.googlecode.com/svn/trunk/images/binding.png)

> Do the same for Last name text field and OHIP number text field (note that you should select ID for the OHIP number)

10. Go to **Diagram** Tab in **Checkin service** and connect the **start** and **end** event to the **Checkin Coach** and save.

> ![https://real-time-patient-flow-management.googlecode.com/svn/trunk/images/CheckinDiagram.png](https://real-time-patient-flow-management.googlecode.com/svn/trunk/images/CheckinDiagram.png)

Now you have finished creating the interface for the form the patient should fill out at Checkin.