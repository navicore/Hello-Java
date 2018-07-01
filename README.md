#Hello Java in Resin.io

#### NOTE this is an experimental fork to replace Oracle JDK with OpenJDK due java.lang.VerifyError and "Error exists in the bytecode" bugs in the Oracle build. Replace `github.com/resin-io` with `github.com/navicore` in the instructions below to try it

## Introduction

This project installs OpenJDK8 (JRE8 included) which allows you to execute Java applications on [Resin.io](http://resin.io).

This is a very simple project that is an example of how to run Java code on a Raspberry Pi.

You can build and deploy your code on the Raspberry Pi. Other JDK versions are also supported.

## Parts

The recipe for this project is as follows:
* A Raspberry Pi and USB -> micro USB cable for power.
* Java source file

### Resin.io Setup & Deployment

1. If you haven't got a [Resin.io](http://resin.io) account, visit [dashboard.resin.io](http://alpha.resin.io) and sign up.
1. Start a new applicaton on [Resin.io](http://resin.io) download the .zip file, format the SD card in FAT32 and extract it to your SD card.
1. Insert the SD card into the Raspberry Pi, power it up using the micro-usb cable and connect to the Internet.
1. After about 10 minutes your new device should show up on your application dashboard.
1. You can now clone the Hello.Java repo:

`git clone https://github.com/resin-io/Hello-Java.git`

Then add the resin remote:

`git remote add resin git@git.resin.io:<myUserName>/<myApplicationName>.git`

And finally push the code to your Raspberry Pi:

`git push resin master`

Now you can enjoy Java code on [Resin.io](http://resin.io).
