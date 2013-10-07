Gradle Koans
============

You can run gradle with native command `gradle` or with gradle wrapper `./gradlew`

After downloading run:

    gradle verify --continue

It should build successfully.

Then remove all solutions by running:

    gradle removeSolutions

Now after running `verify` task it will fail in many projects. Edit `build.gradle` files and fix all koans according to instructions. 
