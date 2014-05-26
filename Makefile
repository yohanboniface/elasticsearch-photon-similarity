test:
	mvn test
package:
	mvn clean package
install:
	sudo $(ES_HOME)/bin/plugin -remove photon-similarity && sudo $(ES_HOME)/bin/plugin -url file://$(PWD)/target/releases/elasticsearch-photon-similarity-0.0.1.zip -install photon-similarity && sudo service elasticsearch restart
