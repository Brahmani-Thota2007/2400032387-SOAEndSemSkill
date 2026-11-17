SPRING BOOT API GATEWAY + ACCOUNT SERVICE EXPERIMENT

Requirements:
- JDK 17 or later
- Maven 3.6+
- Spring Tool Suite (STS)

PROJECTS:
1. account-service  -> runs on port 8081
2. api-gateway      -> runs on port 8080

IMPORT INTO STS:
1. Extract this ZIP file.
2. In STS, choose File -> Import -> Maven -> Existing Maven Projects.
3. Browse to the extracted spring-boot-api-gateway-experiment folder.
4. Select both projects and click Finish.
5. Wait for Maven dependencies to download.

RUN:
1. Open AccountServiceApplication.java in account-service.
2. Right-click -> Run As -> Spring Boot App.
3. Open ApiGatewayApplication.java in api-gateway.
4. Right-click -> Run As -> Spring Boot App.

TEST IN BROWSER / POSTMAN:
GET  http://localhost:8080/api/accounts/internal
Expected response:
Internal account details: [Savings Account, Current Account]

POST http://localhost:8080/api/accounts/create
Header: Content-Type: application/json
Body:
{
  "accountHolder": "Ankitha",
  "accountType": "Savings"
}
Expected response:
Account created successfully: Ankitha - Savings

PATH REWRITING:
The client calls /api/accounts/... at the gateway.
The gateway removes the /api prefix and forwards the request to
the account service as /accounts/...

IMPORTANT:
Start account-service first, then api-gateway.
This is a learning demo. The internal accounts endpoint is not secured.
Do not expose real account or customer information without authentication
and authorization.
