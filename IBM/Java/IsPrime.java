import com.google.gson.JsonObject;

public class Prime {
  public static JsonObject main(JsonObject args) {
    int max = 10;
    int i = 0;
    int num = 0;
    String primeNumbers = "";
    if (args.has("max")) max = args.getAsJsonPrimitive("max").getAsInt();
    for (i = 1; i <= max; i++) {
      int counter = 0;
      for (num = i; num >= 1; num--) {
        if (i % num == 0) {
          counter = counter + 1;
        }
      }
      if (counter == 2) {
        // Appended the Prime number to the String
        primeNumbers = primeNumbers + i + " ";
      }
    }
    JsonObject response = new JsonObject();
    response.addProperty("payload", primeNumbers);
    return response;
  }
}
