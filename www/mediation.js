/*
 * Licensed under MIT License
 *
 * Community Cordova AdMob Mediation Plugin
 *
 * This is a background plugin that adds mediation adapters.
 * No JavaScript API is exposed - mediation is handled automatically
 * by the native AdMob SDK once configured in the AdMob dashboard.
 */

var AdMobMediation = {
    /**
     * Get plugin version
     * @returns {string}
     */
    version: '1.0.0',

    /**
     * Get list of included mediation partners
     * @returns {Array<string>}
     */
    partners: ['facebook', 'vungle', 'applovin']
};

module.exports = AdMobMediation;
