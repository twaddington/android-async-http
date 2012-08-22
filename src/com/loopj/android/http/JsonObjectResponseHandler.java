package com.loopj.android.http;

import org.json.JSONArray;

/**
 * A wrapper class for <code>JsonHttpResponseHandler</code> that overrides
 * the <code>JSONArray</code> callback methods so the implementer doesn't
 * need to define those methods in their anonymous class instance.
 * 
 * @author Tristan Waddington
 */
public abstract class JsonObjectResponseHandler extends JsonHttpResponseHandler {

    /** Does nothing. */
    @Override
    public void onSuccess(JSONArray response) {
        // Pass
    }

    /** Does nothing. */
    @Override
    public void onFailure(Throwable e, JSONArray errorResponse) {
        // Pass
    }
}
