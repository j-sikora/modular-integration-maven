Maven sample configuration - separated unit tests and integration tests
Modular maven project - tests in modules are in separated directories
Integration tests should be annotated using org.junit.jupiter.api.Tag

dev profile (default) - integration tests are excluded
mvn clean install
mvn clean install -P dev

integration profile - execute all tests (unit and integration)
mvn clean install -P integration
