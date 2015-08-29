Alter the intermediate object definitions:
If you left the InsuranceTutorial project open in Design Data, you are prompted to reload the project. If you closed the project, or Design Data, open the project by using the Open Project from Server Store option on the File menu.
In the Intermediate Objects section, right-click the RequestDetails intermediate object, then click Rename Intermediate Object.
Change the name of the intermediate object to Customer.
The Customer intermediate object contains all the fields from the WebsiteQuoteRequest event that contain the customer contact details. The fields that contain the details of the car go in a separate intermediate object called Car.

From the Customer intermediate object, delete the following fields (which contain details of the car):
Registration
Year
To delete these fields, right-click each field in the right pane of the Intermediate Objects section, then click Delete.
In the Touchpoints section, the RequestDetails event object (under the WebsiteQuoteRequest event definition) and the RequestDetails action object (under the AddToCampaign action definition) are now invalid because some of their fields are no longer mapped to an intermediate object.


In the Touchpoints section, expand the WebsiteQuoteRequest event, then the RequestDetails event object, then click the Customer object constructor to display its fields. Delete the following fields from the Customer object constructor because they are no longer relevant to that object constructor:
Registration
Year
In the left Intermediate Objects section, right-click, then click Insert Intermediate Object > Blank.
Name the new intermediate object Car.
The Car intermediate object shows that it is invalid with a red 'no entry' sign overlaid on its icon, because no fields have been mapped to the Car intermediate object yet.

Drag the following fields from the RequestDetails event object (make sure that it is the event object under the WebsiteQuoteRequest event definition, and not the action object of the same name which is under the AddToCampaign action definition) to the Car intermediate object:
Registration
Year
There are now two field constructors, Customer and Car, displayed under the RequestDetails event object to represent the mapping of the fields from the event object to the two intermediate objects.

The icon for the RequestDetails action object still shows that it is invalid, because the mapping from the new intermediate object, Car, is still incomplete.

In the Touchpoints section, right-click the RequestDetails action object (under the Marketing touchpoint), then click Delete Action Object. The RequestDetails action object is deleted.
In the Intermediate Objects section, drag the Customer intermediate object to the AddToCampaign action. A Customer action object is created under the AddToCampaign action.
In the Intermediate Objects section, drag the Car intermediate object to the AddToCampaign action. A Car action object is created under the AddToCampaign action.
Save the project by clicking File > Save Project. Because you are working on a project that is in the project store, when you click Save Project, the project is saved directly to the project store.
The AddToCampaign action definition now contains two action objects, Customer and Car, that are mapped from the Customer and Car intermediate objects.
You can now define the PolicyPurchased event by using the Customer and Car intermediate objects to create the action objects.