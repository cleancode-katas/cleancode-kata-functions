## Given

  Array of values like follows
    { 
        "Nagpur-Maharashtra",
        "Raipur-Chattisgad",
        "Mumbai-Maharashtra",
        "Surat-Gujarat"
    }
   
   
## Task:

    Create a Map with key as State name 
    and value as collection of Cities
    
 
 ## How to refactor switch
    
 input: day
 task per day process
 
 ```
 public void process(String day)  {
    DayStrategy strategy = dayProcessMap.get(day);
    strategy.doDayJob();
 }
 ```
 
 
 
 
 
 
 
 
 
 