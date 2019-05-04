WebOS Quick Install v4.7.0u
===================
> **NOTICE: THIS TOOL IS DESIGNED FOR LEGACY PALM/HP WEBOS AND SOME VERSIONS OF LUNEOS. IT IS NOT COMPATIBLE WITH WEBOS OSE OR LG WEBOS.**

[![](http://i57.tinypic.com/rc7all_th.png)](http://oi57.tinypic.com/rc7all.jpg)


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


**Setup Guide/Problem Troubleshooting**
* If you would like step-by-step directions on how to get things up and running, or are encountering some issues, I highly recommend checking out the official **[WOSQI Homebrew Guide](http://bit.ly/wosqi-guide)**.

------------------------------
**What's new in v4.7.0u:**
------------------------------

1. Now uses user Java preferences rather than system Java preferences

2. Fixed several NullPointerException errors

3. Fixed blank package description icons/screenshots in Package Viewer window

4. Imported and made use of JPowerShell API in order to implement an awesome powershell self-elevating permissions hack that triggers UAC to start novacom (from https://github.com/profesorfalken/jPowerShell)

5. Converted project from NetBeans to Eclispe

6. Converted project from Java 6/CC1.5 to Java 12/CC11. Java 7 or above is now reccomended, as is the use of OpenJDK (https://www.adoptopenjdk.net)

7. Install folder is no longer created until novacom is detected

8. Most of the novacom driver detection code is re-written from the ground up to better support Linux and macOS on all architectures, including armhf. This means that novacom can now be detected accurately on headless servers, or even a Raspberry Pi! Windows novacom detection support is retained from earlier versions

9. On Windows and Linux, if novacom is installed, but not running, it will now be started. (This is not needed on macOS, because novacomd runs perpetually once installed)

11. If the Install folder is empty, it will now be deleted upon exit

12. Re-hosted webos-clock-themer repository at https://github.com/NotAlexNoyle/WebOS-Clock-Themer/

13. Updated "about" window

14. Fixed package icon display in Package Viewer window

15. Fixed package screenshot display in Package Viewer window

16. Several other minor edits and bug fixes (see the commit history at https://github.com/NotAlexNoyle/WebOS-Quick-Install for a comprehensive comparison)

------------------------------
**Planned for future versions:**
------------------------------

1. Fix a lot of code spacing, order, and indentation

2. Fix several eclipse warnings

3. Fully comment/document code

4. Show a photo of whatever device that is currently selected, instead of always showing an original Pre. Also show this in "installing" view.

5. Migrate from Better Swing Application Framework to standard Java Swing

6. Fix prefs warnings at runtime on Linux

7. Fix a couple of windows registry errors

8. Add support for BSDs and Solaris-based operating systems (and possibly more)

9. Fix missing splash screen

10. Distrbute operating system-specific packages with icons (.exe, .app, etc) instead of .jar for everything.

11. Fix armhf device detection

12. Locate and remove unwanted loop when loading image assets in PackageViewer upon first launch

13. Fix layout of About window on MacOS

14. Fix Linux novacomd installation, and add support for installing novacomd on armhf

15. Work on community feedback and implement community requests!


**Requirements**

* [Java 1.7 or greater](http://www.java.com/en/download/manual.jsp)
 * For Mac OS X, once you've installed Java 1.6, run /Applications/Utilities/Java/Java Preferences. Then click and drag Jave SE 6 to top of both list, and exit the program. This will set Java 1.6 as the default version to use.

* Novacom or [Adb](http://lifehacker.com/the-easiest-way-to-install-androids-adb-and-fastboot-to-1586992378)
 * This will get installed automatically when you run WebOS Quick Install (except on linux for now). ADB is required for LuneOS only.

* DevMode enabled
 * This can be done on your device by typing "upupdowndownleftrightleftrightbastart", opening the DeveloperMode app, and enabling the feature. Not required for LuneOS.

Lastly, when you plug in the device, if you want to use WebOS Quick Install, choose the "Just Charge" option on the device.

**Running WebOS Quick Install**

* Simply double-click WebOSQuickInstall.jar and (as long as Java is installed properly) it will launch
