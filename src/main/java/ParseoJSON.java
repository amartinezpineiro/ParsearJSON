import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ParseoJSON {
    static String json = "{\n" +
            "    \"pageInfo\": {\n" +
            "            \"pageName\": \"Homepage\",\n" +
            "            \"logo\": \"https://www.example.com/logo.jpg\"\n" +
            "    },\n" +
            "    \"posts\": [\n" +


            "            {\n" +
            "                \"post_id\": \"0123456789\",\n" +
            "                \"actor_id\": \"1001\",\n" +
            "                \"author_name\": \"Jane Doe\",\n" +
            "                \"post_title\": \"How to parse JSON in Java\",\n" +
            "                \"comments\": [{\"comment\":\"FANTASTICO\"},{\"comment\":\"AMEISIN\"}],\n" +
            "                \"time_of_post\": \"1234567890\"\n" +
            "            },\n" +


            "            {\n" +
            "                \"post_id\": \"22222222222\",\n" +
            "                \"actor_id\": \"1001\",\n" +
            "                \"author_name\": \"Jane Doe\",\n" +
            "                \"post_title\": \"How to parse JSON in Java\",\n" +
            "                \"comments\": [{\"comment\":\"very well\"},{\"comment\":\"it is fine\"}],\n" +
            "                \"time_of_post\": \"1234567890\"\n" +
            "            },\n" +


            "            {\n" +
            "                \"post_id\": \"33333333333\",\n" +
            "                \"actor_id\": \"1001\",\n" +
            "                \"author_name\": \"Jane Doe\",\n" +
            "                \"post_title\": \"How to parse JSON in Java\",\n" +
            "                \"comments\": [{\"comment\":\"FANTASTICO\"},{\"comment\":\"AMEISIN\"}],\n" +
            "                \"time_of_post\": \"1234567890\"\n" +
            "            }\n" +


            "    ]\n" +
            "}";
    public static void main(String[] args) throws JSONException {
        JSONObject obj = new JSONObject(json);
        String pageName = obj.getJSONObject("pageInfo").getString("pageName");

        System.out.println(pageName);

        JSONArray arr = obj.getJSONArray("posts");
        for (int i = 0; i < arr.length(); i++) {
            String post_id = arr.getJSONObject(i).getString("post_id");
            String comments = arr.getJSONObject(i).getString("comments");
            System.out.println(post_id);
            System.out.println(comments);
        }
    }
}