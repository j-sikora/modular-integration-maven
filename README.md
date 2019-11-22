dev profile (default) - execute only integration tests:
mvn clean install
mvn clean install -P dev

integration profile - execute all tests (unit and integration)
mvn clean install -P integration