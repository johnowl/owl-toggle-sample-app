# Feature Toggle Sample App

This sample app ilustrates the use of [feature-toggle-client](https://github.com/johnowl/owl-toggle-client) in a Spring web application to consume rules stored in the [feature-toggle-server](https://github.com/johnowl/owl-toggle-server)


1. Add dependency in [build.gradle.kts](build.gradle.kts)
2. Set feature toggle server url in [application.properties](src/main/resources/application.properties)
3. Add the client package to [ComponentScan](src/main/kotlin/com/johnowl/toggle/sampleapp/SampleAppApplication.kt)
4. Inject FeatureToggleClient in the class like I did in [controller class](src/main/kotlin/com/johnowl/toggle/sampleapp/AppController.kt)
