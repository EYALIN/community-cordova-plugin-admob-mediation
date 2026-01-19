# Community Cordova Plugin AdMob Mediation

[![NPM version](https://img.shields.io/npm/v/community-cordova-plugin-admob-mediation)](https://www.npmjs.com/package/community-cordova-plugin-admob-mediation)
[![Downloads](https://img.shields.io/npm/dm/community-cordova-plugin-admob-mediation)](https://www.npmjs.com/package/community-cordova-plugin-admob-mediation)

A Cordova plugin that adds mediation partner adapters for Google AdMob. This plugin works alongside your main AdMob plugin to enable mediation with Facebook/Meta Audience Network, Vungle, and AppLovin.

## Support This Plugin

I dedicate a considerable amount of my free time to developing and maintaining many Cordova plugins for the community ([See the list with all my maintained plugins][community_plugins]).

To help ensure this plugin is kept updated, new features are added and bugfixes are implemented quickly, please donate a couple of dollars (or a little more if you can stretch) as this will help me to afford to dedicate time to its maintenance.

Please consider donating if you're using this plugin in an app that makes you money, or if you're asking for new features or priority bug fixes. Thank you!

[![Sponsor Me](https://img.shields.io/static/v1?label=Sponsor%20Me&style=for-the-badge&message=%E2%9D%A4&logo=GitHub&color=%23fe8e86)](https://github.com/sponsors/EYALIN)

## Features

- **Facebook/Meta Audience Network** - Mediation adapter for Meta ads
- **Vungle** - Mediation adapter for Vungle ads
- **AppLovin** - Mediation adapter for AppLovin ads
- **SKAdNetwork IDs** - Includes all required SKAdNetwork identifiers for iOS

## Installation

```bash
cordova plugin add community-cordova-plugin-admob-mediation
```

Or with Ionic:

```bash
ionic cordova plugin add community-cordova-plugin-admob-mediation
```

Or from local path:

```bash
cordova plugin add /path/to/community-cordova-plugin-admob-mediation
```

## Requirements

- Cordova >= 7.0.0
- cordova-android >= 6.0.0
- cordova-ios >= 5.0.0
- An AdMob plugin (e.g., `community-cordova-plugin-admob`)

## Usage

This is a background plugin - no code integration is required. Simply install the plugin and the mediation adapters will be automatically included in your build.

The mediation partners will be available for ad serving once you configure them in your AdMob dashboard:

1. Go to [AdMob Console](https://admob.google.com/)
2. Navigate to Mediation > Create Mediation Group
3. Add the mediation partners (Facebook, Vungle, AppLovin)
4. Configure your ad unit IDs for each partner

## Included Mediation Adapters

### Android

| Partner | Adapter Version |
|---------|-----------------|
| Facebook/Meta | 6.21.0.0 |
| Vungle | 7.6.1.0 |
| AppLovin | 13.5.1.0 |

### iOS

| Partner | Adapter Version |
|---------|-----------------|
| Facebook/Meta | ~> 6.21 |
| Vungle | ~> 7.6 |
| AppLovin | ~> 13.5.0.0 |

## Platform Support

- Android
- iOS

## Contributing

- Star this repository
- Open issue for feature requests
- [Sponsor this project](https://github.com/sponsors/EYALIN)

## License

This project is [MIT licensed](LICENSE).

## Related Plugins

- [community-cordova-plugin-admob](https://github.com/EYALIN/community-cordova-plugin-admob) - Main AdMob plugin
- [community-cordova-plugin-consent](https://github.com/EYALIN/community-cordova-plugin-consent) - User consent plugin for GDPR/ATT

[community_plugins]: https://github.com/EYALIN?tab=repositories&q=community&type=&language=&sort=
