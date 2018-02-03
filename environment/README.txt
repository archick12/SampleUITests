cd SampleUITests/environment

# start hub
java -jar selenium-server-standalone-3.4.0.jar -role hub

# start node
java -Dwebdriver.chrome.driver=chromedriver -jar selenium-server-standalone-3.4.0.jar -role node
java -debug -Dwebdriver.gecko.driver=geckodriver-18.0-mac -jar selenium-server-standalone-3.4.0.jar -role node



# Alex

java -jar selenium-server-standalone-3.4.0.jar -role hub

java -Dwebdriver.gecko.driver=/Users/alexanderpustovoy/Documents/SampleUITests/environment/geckodriver-18.0-mac -jar selenium-server-standalone-3.4.0.jar -role node

