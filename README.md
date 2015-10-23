MILESTONE: TEST+ANALYSIS
------------------------

Orignal Project: [okhttp](https://github.com/square/okhttp)


####  1: The ability to run unit tests, measure coverage, and report the results.

We used existing test cases of the project.
Maven commands
'''
compile
cobertura:cobertura -Dcobertura.report.format=xml
site
'''

![Code Coverage](https://github.com/apoorvmahajan/okhttp/blob/master/Screenshot/Screen%20Shot%202015-10-23%20at%205.39.27%20PM.png)

####  2: The ability to improve testing coverage.

#### 3: The ability to run an existing static analysis tool on the source code.

####  4: The ability to extend an existing analysis tool with a custom analysis.

####  5: The ability to fail builds if it fails a minimum testing criteria. 

####  6: TThe ability to parse a code files and json files in order to detect the presence of AWS/digital ocean security tokens.


Team Members: Apoorv Mahajan (amahaja3), Ankit Agrawal (aagrawa5), Shraddha Naik (sanaik2)
