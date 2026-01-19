/*
 * Licensed under MIT License
 *
 * Community Cordova AdMob Mediation Plugin
 *
 * This is a no-op plugin class. The actual mediation is handled
 * by the native AdMob SDK through the included adapter dependencies.
 * No custom code is required - just having the adapters in the build
 * enables mediation once configured in the AdMob dashboard.
 */

package com.community.cordova.admob.mediation;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * AdMob Mediation Plugin
 *
 * This plugin adds mediation partner adapters (Facebook, Vungle, AppLovin)
 * to your Cordova app. No code interaction is required - the adapters
 * are automatically picked up by the AdMob SDK.
 */
public class AdMobMediation extends CordovaPlugin {

    private static final String VERSION = "1.0.0";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("getVersion")) {
            callbackContext.success(VERSION);
            return true;
        }
        return false;
    }
}
