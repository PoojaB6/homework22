package delivery.utils;

import com.google.gson.Gson;
import delivery.api.BaseSetupApi;
import delivery.dto.DecisionDto;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiClient extends BaseSetupApi {
    public static Response getLoanDetails(String amountValue,String PeriodValue){

        return given()
                .log()
                .all()
                .queryParam("amount","500")
                .queryParam("period","12")
                .get( "/api/loan-calc")
                .then()
                .log()
                .all()
                .extract()
                .response();
    }

    public static Response postCalcDecision(){

        return given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .body( new Gson().toJson( new DecisionDto(1000,0,true,500,12,40) ) )
                .post("api/loan-calc/decision" )
                .then()
                .log()
                .all()
                .extract()
                .response();
    }

}