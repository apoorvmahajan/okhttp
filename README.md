MILESTONE: TEST+ANALYSIS
------------------------

## TESTING
####  1: The ability to run unit tests, measure coverage, and report the results.

We used existing test cases of the project.
Maven commands
```
compile
cobertura:cobertura -Dcobertura.report.format=xml
site
```

![Code Coverage](https://github.com/apoorvmahajan/okhttp/blob/master/Screenshot/Screen%20Shot%202015-10-23%20at%205.39.27%20PM.png)

####  2: The ability to improve testing coverage.
We ran randoop and generated test cases.
This is the coverage we get after running Randoop:
![Code Coverage](https://github.com/apoorvmahajan/okhttp/blob/master/Screenshot/Screen%20Shot%202015-10-23%20at%205.40.21%20PM.png)

## ANALYSIS
#### 3: The ability to run an existing static analysis tool on the source code.
We are using Find Bugs as a static analysis tool
![Find Bugs](https://github.com/apoorvmahajan/okhttp/blob/master/Screenshot/Screen%20Shot%202015-10-23%20at%207.53.15%20PM.png)

####  4: The ability to extend an existing analysis tool with a custom analysis.
We are extending Find Bugs to generate a new rule which will give the ratio of public methods to the total number of methods.
This is a rule under the category BAD PRACTICE.
![Find Bugs with extension](https://github.com/apoorvmahajan/okhttp/blob/master/Screenshot/Screen%20Shot%202015-10-23%20at%207.53.03%20PM.png)

####  5: The ability to fail builds if it fails a minimum testing criteria. 
##### TEST GATE
For test gate we are specifying a coverage threshold as below:
![test gate](https://github.com/apoorvmahajan/okhttp/blob/master/Screenshot/Screen%20Shot%202015-10-23%20at%207.56.33%20PM.png)
The result of this test gate:
![](https://github.com/apoorvmahajan/okhttp/blob/master/Screenshot/Screen%20Shot%202015-10-23%20at%208.01.40%20PM.png)

##### ANALYSIS GATE
For analysis gate we are specifying a bugs threshold as below:
![analysis gate](https://github.com/apoorvmahajan/okhttp/blob/master/Screenshot/Screen%20Shot%202015-10-23%20at%207.57.14%20PM.png)
The result of this analysis gate:
![](https://github.com/apoorvmahajan/okhttp/blob/master/Screenshot/Screen%20Shot%202015-10-23%20at%207.52.37%20PM%202.png)


####  6: TThe ability to parse a code files and json files in order to detect the presence of AWS/digital ocean security tokens.
We created a pre-commit hook, which checks for: .pem, .key, .ppk files.
If it finds any of these file extensions, commit will be rejected.
Else it will parse through each file to check for regex of aws key/ aws identifier and digital ocean key.
```
'(?<![A-Za-z0-9/+=])[A-Za-z0-9/+=]{40,80}(?![A-Za-z0-9/+=])'
'(?<![A-Z0-9])[A-Z0-9]{20}(?![A-Z0-9])'
```
It also checks if line has "-----BEGIN RSA PRIVATE KEY-----".

Code: [pre-commit hook](https://github.com/apoorvmahajan/okhttp/blob/master/pre-commit)
[![Click here to watch the screencast of task 6] (http://img.youtube.com/vi/YOUTUBE_VIDEO_ID_HERE/0.jpg)](https://youtu.be/MGI4jVezfBs)


#### Configuration files:

Test Analysis job: [config file](https://github.com/apoorvmahajan/okhttp/blob/master/Configuration_Files/config_TA2.xml)
Test Analysis 1 job: [config file](https://github.com/apoorvmahajan/okhttp/blob/master/Configuration_Files/config_TA1.xml)



<h3>Screencast </h3>

Click here to watch the screencast.
[![Click here to watch the screencast] (http://img.youtube.com/vi/YOUTUBE_VIDEO_ID_HERE/0.jpg)](https://youtu.be/MGI4jVezfBs)

###### Team Members: Apoorv Mahajan (amahaja3), Ankit Agrawal (aagrawa5), Shraddha Naik (sanaik2)
