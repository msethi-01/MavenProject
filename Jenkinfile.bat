set projectLocation=C:\Users\Monika\eclipse-workspace\Maven_AP
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause