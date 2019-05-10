WebOS Quick Install v4.7.1u
===================
> **NOTICE: THIS TOOL IS DESIGNED FOR LEGACY PALM/HP WEBOS AND SOME VERSIONS OF LUNEOS. IT IS NOT COMPATIBLE WITH WEBOS OSE OR LG WEBOS.**

[![](http://i57.tinypic.com/rc7all_th.png)](http://oi57.tinypic.com/rc7all.jpg)

Donate to support the new maintainer:
https://www.paypal.me/NotAlexNoyle

Donate to support the original developer:
https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=7G5QLAXMVVSGY

This program is intended for use with WebOS applications that are in-testing, which under section 4.2 of the Palm SDK License Agreement allows for such unapproved applications to be installed on Palm devices.  Applications installed with WebOS Quick Install have not be tested by Palm and are installed at your own risk.

Powered by JayCanuck's [webOSLib java library](https://github.com/JayCanuck/java-weboslib).

**Features**

* Stylish easy-to-use GUI
* Cross-platform support (Windows, Mac OS X, Linux)
* Supports off-feed .ipk and .patch files
* Full-featured feed viewer, with custom feeds allowed
* No Linux knowledge required, no root access required.
* webOS 3.x-compatible
* Full device information section
* Send and receive files to and from a webOS device.
* Multiple device support
* Supports Open webOS/LuneOS
* Supports English, French, German, and Simplified Chinese

------------------------------
What's new in v4.7.1u:
------------------------------

1. Fixed some code spacing and indentation

2. Removed unnecessary files

3. Fixed compatibility with early versions of Java 7

4. Bumped version number, and made title automatically adapt to new version numbers

------------------------------
Planned for future versions:
------------------------------

1. Fix more code spacing and indentation (Currently up to FeedViewer.java)

2. Fix several eclipse warnings

3. Fully comment/document code

4. Show a photo of whatever device that is currently selected, instead of always showing an original Pre. Also show this in "installing" view.

5. Migrate from Better Swing Application Framework to standard Java Swing

6. Fix prefs warnings at runtime on Linux

7. Fix a couple of windows registry errors

8. Add support for BSDs and Solaris-based operating systems (and possibly more)

9. Distrbute operating system-specific packages with icons (.exe, .app, etc) instead of .jar for everything.

10. Fix armhf device detection

11. Locate and remove unwanted loop when loading image assets in PackageViewer upon first launch

12. Fix layout of About window on MacOS

13. Fix Linux novacomd installation, and add support for installing novacomd on armhf

14. Work on community feedback and implement community requests!

15. Fix code order / refactor in general.

16. Update translations

17. Resolve this issue: https://github.com/JayCanuck/webos-quick-install/issues/4

18. Fulfill this request: https://github.com/JayCanuck/webos-quick-install/issues/3

19. Add "continue anyway" option in the "there are no devices currently connected" pane, and change "ok" to "quit"

20. Fix splash screen

**Requirements**

* [OpenJDK 1.7 or greater](https://www.adoptopenjdk.net/)

* Novacom or [Adb](http://lifehacker.com/the-easiest-way-to-install-androids-adb-and-fastboot-to-1586992378)
 * Novacom will get installed automatically when you run WebOS Quick Install (except on linux for now). ADB is required for LuneOS only.

* DevMode enabled
 * This can be done on your device by typing "upupdowndownleftrightleftrightbastart", opening the DeveloperMode app, and enabling the feature. Not required for LuneOS.

* When you plug in the device, if you want to use WebOS Quick Install, choose the "Just Charge" option on the device.

**Running WebOS Quick Install**

* Simply double-click WebOSQuickInstall.jar and (as long as Java is installed properly) it will launch.
