##HICX-task Directory-Monitor-APP

This is directory monitor application. It monitors a directory (passed in the programme argument) and reads both existing and newly added files in that directory and prints out statistics such as number of dots, total number of words and the count of most used word to the console.

The application is made up of four packages: the directory folder monitor, interfaces, fileProcessor and fileStatistics.

directoryFolderMonitor package: This is where the monitoring happens in the application.Directory path and monitors the directory for create events.

Interface package: contains all the interfaces in the program.

fileProcessing package: contains the class that takes care of reading content from files.

fileStatistic package: contains the classes the process different types of statistics from the file content. The statistics implemented include: All word count, dot counts and highest ocurring word.

The application was developed with java 11. The only dependencies added are those necessary for testing: JUnit, Mockito.

The application can be run through the main method. Once you run the main method, the application starts. However, you have to provide a directory path located in your local machine in the programme argument of the Run configuration environment.

Alternatively, you can comment out the first "if condition" in the main method (in the Main Class) that checks if a path was passed in the programme argument and the assign a valid path to a directory in your local machine to the variable "passedDirectoryPath" then run the main method to use the programme.
