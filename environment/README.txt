cd SampleUITests/environment

# start hub
java -jar selenium-server-standalone-3.8.1.jar -role hub

# start node
java -Dwebdrive.gecko.driver=geckodriver-18.0-mac -jar selenium-server-standalone-3.8.1.jar -role node
java -Dwebdrive.gecko.driver=geckodriver -jar selenium-server-standalone-3.8.1.jar -role node