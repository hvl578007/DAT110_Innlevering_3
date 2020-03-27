# Unit test classes for project 3

You should clone the unit test project which can be found in this repository.

Open a separate IDE, and import the unit-test project into the environment. You should specify the 'main project' in the build dependency.
It means, you have to import the original project into this IDE workspace as well but make sure you DO NOT SELECT THE OPTION TO COPY THE PROJECT INTO THE WORKSPACE. The project must be using the same directory as in the first IDE. You can then configure your build path for the unit-test project to include the original project as a required project.

### Unit tests
Tasks 2 to 7 require that the 5 chord processes are started before you can test your implementations.
- no.hvl.dat110.unit.tests: contains all the unit test cases for the project.
- no.hvl.dat110.utility.FileDistributorClient: should be used to distribute files (5 files from the file folder) to the replicas in the chord ring. Note that the 5 processes must have been started before running this class. 
- no.hvl.dat110.utility.FileFinderClient: can be used as client that requests for all server replicas holding any of the distributed files.
- no.hvl.dat110.utility.RingMonitor: can be run to see if the ring is correct. 
