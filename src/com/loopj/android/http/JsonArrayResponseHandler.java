package com.loopj.android.http;

import org.json.JSONObject;

/**
 * A wrapper class for <code>JsonHttpResponseHandler</code> that overrides
 * the <code>JSONObject</code> callback methods so the implementer doesn't
 * need to define those methods in their anonymous class instance.
 * 
 * @author Tristan Waddington
 */
public abstract class JsonArrayResponseHandler extends JsonHttpResponseHandler {

    /** Does nothing. */
    @Override
    public void onSuccess(JSONObject response) {
        // Pass
    }

    /** Does nothing. */
    @Override
    public void onFailure(Throwable e, JSONObject errorResponse) {
        // Pass
    }
}
