1. Structure, Following is the structure of the framework
          i.   src -> main -> java
          ii.  src -> test -> java
          iii. src -> test -> resources

    scr -> main -> java contains all the generic java files of the framework, like Actions
    src -> test -> java contains all the application specific java files of framework, like TestEngine and Executor
    src -> test -> resources has all necessary files which is needed while execution, like Repository and .story files

2. Story, As mentioned in the assignment this framework executes only one story as of now, however it is flexible to add more stories if needed. following are the steps of assignment story:-
          i.   Opens http://www.imdb.com
          ii.  Search for "Star Wars: Episode I"
          iii. Go to list of cast and crews
          iv.  Check if Jim Morris has a special thanks

3. How to Run, In order to execute the tests you need to follow the steps below:-
          i.   Open Terminal
          ii.  Go to Project directory
          iii. Type, “mvn clean verify” and hit enter

4. Reporting, To check report for a run you can simply go to target/site/thucydides directory and access index.html, it will show you complete report with descriptive analysis
