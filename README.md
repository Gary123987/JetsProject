#Jets Project

#Overview
In this project, we create an Airfield array that contains several Jet objects. The default Airfield is created on startup, then populated by reading a text file containing the details of 5 jets. The user is then given a menu with several options. The first option is to list the jets, including all relevant data. The second option is to "fly" the gets, which calls a method in the abstract class that will tell the user how long each jet can fly based on speed and range. The third and forth option find the jet with fastest speed and longest range respectively, which the program does by iterating through each jet to find the one with the highest relevant field. Options 6, 7, and 8, are for specialized jets. Drones, Bombers, and Cargo jets all have a unique interface, which is called when the user chooses which specialized type to activate. Finally, the user can add or remove jets from the airfield, by entering information on a new jet or choosing a jet to remove.  

#Technologies Used
Java-OOP, Eclipse IDE, GitHub, Sublime

#Lessons Learned
The first lesson I learned was the importance of understanding when and where to cast objects. When trying to call interface methods for the specialty types of jets, they had to be casted to the corresponding type. The next lesson learned is that creating a local jet, to be used in for loops and while loops, is helpful for comparing jets.  
