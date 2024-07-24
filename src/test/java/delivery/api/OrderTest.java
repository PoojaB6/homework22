package delivery.api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

import org.junit.jupiter.api.Test;
import delivery.utils.ApiClient;



public class OrderTest extends BaseSetupApi {

    @Test
    void getLoanDetails() {

        Response response = ApiClient.getLoanDetails("500","12");

        softly.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.SC_OK);
        softly.assertThat(response.getContentType()).isEqualTo(ContentType.JSON.toString());
    }

    @Test
    void getLoanDetailsWithIncorrectValue() {

        Response response = ApiClient.getLoanDetails("60","13");

        softly.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.SC_BAD_REQUEST);
    }

    @Test
    void postLoanCalcDecision() {

        Response response = ApiClient.postCalcDecision();

        softly.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.SC_OK);
    }
}