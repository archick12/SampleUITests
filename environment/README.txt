cd SampleUITests/environment

# start hub
java -jar selenium-server-standalone-3.8.1.jar -role hub

# start node
java -Dwebdrivegecko.driver=geckodriver-18.0-mac -jar selenium-server-standalone-3.8.1.jar -role node