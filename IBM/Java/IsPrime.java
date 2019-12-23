import com.google.gson.JsonObject;

public class IsPrime {
  public static JsonObject main(JsonObject args) {

    int number = 2;
    boolean flag = false;

    if (args.has("number"))
      number = args.getAsJsonPrimitive("number").getAsInt();

    if (number < 2) {
      flag = true;
    } else {
      for (int i = 2; i <= number / 2; ++i) {
        if (number % i == 0) {
          flag = true;
          break;
        }
      }
    }

    flag = !flag;

    JsonObject response = new JsonObject();
    response.addProperty("payload", flag);
    return response;
  }
}
