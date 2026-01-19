/*
 * Licensed under MIT License
 *
 * Community Cordova AdMob Mediation Plugin
 *
 * This is a no-op plugin class. The actual mediation is handled
 * by the native AdMob SDK through the included CocoaPods dependencies.
 * No custom code is required - just having the adapters in the build
 * enables mediation once configured in the AdMob dashboard.
 */

#import "CDVAdMobMediation.h"

@implementation CDVAdMobMediation

static NSString* const VERSION = @"1.0.0";

- (void)getVersion:(CDVInvokedUrlCommand*)command {
    CDVPluginResult* result = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:VERSION];
    [self.commandDelegate sendPluginResult:result callbackId:command.callbackId];
}

@end
