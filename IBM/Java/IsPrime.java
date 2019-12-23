import com.google.gson.JsonObject;

public class Prime {
  public static JsonObject main(JsonObject args) {

    int number = 2;
    boolean flag = false;

    if (args.has("number"))
      max = args.getAsJsonPrimitive("number").getAsInt();

    if (number < 2) {
      flag = true;
    } else {

      {
        if (num % i == 0) {
          flag = true;
          break;
        }
      }
    }

    flag =!flag;

    JsonObject response = new JsonObject();
    response.addProperty("payload", flag);
    return response;
  }
}
