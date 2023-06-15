# ChatApp

ChatApp is a chat application that allows users to communicate with others who are part of the same database. It provides real-time messaging and notifications even when users are not online. The application is built using Java and utilizes Firebase for its backend functionality.

## Setup and Configuration

To set up and configure the ChatApp project, please follow these steps:

1. Clone the project repository to your local machine.
git clone https://github.com/your-username/ChatApp.git

2. Go to the Firebase console and create a new project for ChatApp.

3. Add an Android app to your Firebase project named "ChatApp".

4. Download the `google-services.json` file from the Firebase console and place it in the `app` folder of the project.

5. Set up the Firebase Realtime Database:
- Create the necessary database structure and rules to support chat functionality.

6. Obtain the server key for Cloud Messaging:
- Go to the Firebase console and navigate to your project's settings.
- Find the "Cloud Messaging" tab and locate the server key.
- Copy the server key and paste it in the `Constants.java` file of the project.

7. Build and run the app:
- Use Android Studio or your preferred IDE to open the project.
- Build and run the app on an Android device or emulator.
- Create an account within the app to start using ChatApp.

## Dependencies

The project has its dependencies listed in the `build.gradle` file.

## Contributing

Contributions to ChatApp are welcome. If you encounter any issues or have suggestions for improvements, please submit an issue or pull request on the project's GitHub repository.
