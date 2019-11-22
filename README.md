### Maven sample configuration - separated unit tests and integration tests.
Modular maven project - tests in modules are in separated directories
To exclude integration test in dev profile annotate integration test class using org.junit.jupiter.api.Tag

### Building project
dev profile (default) - integration tests (with tag integration) are excluded
mvn clean install
mvn clean install -P dev

integration profile - execute all tests (unit and integration)
mvn clean install -P integration
