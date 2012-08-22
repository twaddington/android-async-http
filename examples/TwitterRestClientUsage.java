import org.json.*;

import com.loopj.android.http.*;

class TwitterRestClientUsage {
    public void getPublicTimeline() {
        TwitterRestClient.get("statuses/public_timeline.json", null, new JsonArrayResponseHandler() {
            @Override
            public void onSuccess(JSONArray timeline) {
                try {
                    JSONObject firstEvent = (JSONObject)timeline.get(0);
                    String tweetText = firstEvent.getString("text");

                    // Do something with the response
                    System.out.println(tweetText);
                } catch(JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Throwable e, JSONArray errorResponse) {
                // Handle an error!
            }
        });
    }
}