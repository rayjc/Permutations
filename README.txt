For this coding exercise, I have used the junit framework for unit testing and it requires the following two files.

Unit Test Requirement:
junit-4.13-beta-3.jar
hamcrest-core-1.3.jar

The .jar files can be downloaded from https://github.com/junit-team/junit4/wiki/Download-and-Install




*** Compile/Run with Unit Test ***
To compile:
javac -sourcepath .  -d . -cp <path-to-junit-jar>/junit-4.13-beta-3.jar StringPermutations.java StringPermutationsTest.java

To run:
java -cp . rayjc.app.StringPermutations [input-string]
java -cp <path-to-junit-jar>/junit-4.13-beta-3.jar:<path-to-junit-jar>/hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore rayjc.app.StringPermutationsTest




*** Compile/Run without Unit Test ie. main program only ***
To compile:
javac -d . StringPermutations.java

To run:
java rayjc.app.StringPermutations [input-string]