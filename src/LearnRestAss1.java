import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LearnRestAss1 {

	public static void main(String[] args) 
	{
    RestAssured.baseURI = "https://reqres.in/api/users?page=2";
	RequestSpecification request1 = RestAssured.given();
    request1.header("Content-Type", "application/json");
    System.out.println(request1.request(Method.GET, "").getBody().asString());
	}

}
