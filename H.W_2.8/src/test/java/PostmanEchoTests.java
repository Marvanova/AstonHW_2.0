import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTests {

    private static final String BASE_URL = "https://postman-echo.com";

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void testGetRequest() {
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("url", containsString("postman-echo.com/get"))
                .body("headers.host", equalTo("postman-echo.com"));
    }


    @Test
    public void testPostRawText() {
        String requestBody = "This is expected to be sent back as part of response body.";

        given()
                .contentType(ContentType.TEXT)
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody))
                .body("json", nullValue());
    }


    @Test
    public void testPostFormData() {
        given()
                .contentType("application/x-www-form-urlencoded")
                .body("foo1=bar1&foo2=bar2")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }


    @Test
    public void testPutRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";

        given()
                .contentType(ContentType.TEXT)
                .body(requestBody)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody));
    }


    @Test
    public void testPatchRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";

        given()
                .contentType(ContentType.TEXT)
                .body(requestBody)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody));
    }


    @Test
    public void testDeleteRequest() {
        String requestBody = "This is expected to be sent back as part of response body.";

        given()
                .contentType(ContentType.TEXT)
                .body(requestBody)
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody));
    }


    @Test
    public void testRequestHeaders() {
        given()
                .header("my-sample-header", "Lorem ipsum dolor sit amet")
                .when()
                .get("/headers")
                .then()
                .statusCode(200)
                .body("headers.my-sample-header", equalTo("Lorem ipsum dolor sit amet"));
    }


    @Test
    public void testResponseHeaders() {
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/response-headers")
                .then()
                .statusCode(200)
                .header("foo1", equalTo("bar1"))
                .header("foo2", equalTo("bar2"))
                .body("foo1", equalTo("bar1"))
                .body("foo2", equalTo("bar2"));
    }


    @Test
    public void testStatus200() {
        given()
                .when()
                .get("/status/200")
                .then()
                .statusCode(200)
                .body("status", equalTo(200));
    }


    @Test
    public void testDelayResponse() {
        given()
                .when()
                .get("/delay/2")
                .then()
                .statusCode(200)
                .body("delay", equalTo("2"));
    }


    @Test
    public void testGetIP() {
        given()
                .when()
                .get("/ip")
                .then()
                .statusCode(200)
                .body("ip", notNullValue());
    }


    @Test
    public void testCurrentTime() {
        given()
                .when()
                .get("/time/now")
                .then()
                .statusCode(200)
                .body(not(emptyString()));
    }


    @Test
    public void testGzipResponse() {
        given()
                .header("Accept-Encoding", "gzip, deflate")
                .when()
                .get("/gzip")
                .then()
                .statusCode(200)
                .header("content-encoding", containsString("gzip"))
                .body("gzipped", equalTo(true));
    }


    @Test
    public void testDeflateResponse() {
        given()
                .header("Accept-Encoding", "gzip, deflate")
                .when()
                .get("/deflate")
                .then()
                .statusCode(200)
                .header("content-encoding", anyOf(containsString("gzip"), containsString("deflate")))
                .body("deflated", equalTo(true));
    }


    @Test
    public void testUtf8Response() {
        given()
                .when()
                .get("/encoding/utf8")
                .then()
                .statusCode(200)
                .header("content-type", containsString("charset=utf-8"));
    }


    @Test
    public void testStreamedResponse() {
        given()
                .when()
                .get("/stream/5")
                .then()
                .statusCode(200)
                .header("transfer-encoding", containsString("chunked"));
    }


    @Test
    public void testBasicAuthSuccess() {
        given()
                .auth().basic("postman", "password")
                .when()
                .get("/basic-auth")
                .then()
                .statusCode(200)
                .body("authenticated", equalTo(true));
    }


    @Test
    public void testBasicAuthFailure() {
        given()
                .auth().basic("postman", "wrong-password")
                .when()
                .get("/basic-auth")
                .then()
                .statusCode(401);
    }


    @Test
    public void testTimestampValidity() {
        given()
                .queryParam("timestamp", "2016-10-10")
                .when()
                .get("/time/valid")
                .then()
                .statusCode(200)
                .body("valid", equalTo(true));
    }


    @Test
    public void testFormatTimestamp() {
        given()
                .queryParam("timestamp", "2016-10-10")
                .queryParam("format", "YYYY")
                .when()
                .get("/time/format")
                .then()
                .statusCode(200)
                .body("format", notNullValue());
    }
}