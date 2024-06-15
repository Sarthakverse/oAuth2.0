![1_YkgY5ktTU3GKsx5khORfwg](https://github.com/Sarthakverse/oAuth2.0/assets/117356021/cd5ddd12-fd3b-402c-b963-c165e6eb829c)

# oAuth 2.0 with Google
This project demonstrates the implementation of "Login with Google" functionality in a Spring Boot 3.3.0 application. Here's how it works:

1. **User Authentication**: When a user tries to log in using Google, they need to enter their Google credentials to authenticate themselves.
2. **Authorization**: After successful authentication, Google will ask the user to grant the necessary permissions for the application.
3. **Application Login**: Once the required permissions are granted, the user is successfully logged into the application.
4. **Registration**: If the user is logging in for the first time and is not yet registered, they will be directed to a registration form to complete their profile and get fully registered.
5. This setup ensures a smooth and secure way for users to authenticate and register using their Google accounts.


## Technology Used

![Java 17](https://img.shields.io/badge/Java-17-green.svg)
![SpringBoot 3.3.0](https://img.shields.io/badge/SpringBoot-3.3.0-yellow.svg)
![OAuth2.0](https://img.shields.io/badge/Google-oAuth2.0-blue.svg)
![Html & Css](https://img.shields.io/badge/Html-Css-blue.svg)
![Postgresql](https://img.shields.io/badge/Database-postgres-blue.svg)


###  Roles
- **`Client`**: The Spring Boot application acts as the client. It requests access to the user's resources (like their Google profile information) on behalf of the user.
- **`Authorization Server`**: Google’s OAuth 2.0 server acts as the authorization server. It handles user authentication and gets their consent to share specific resources with the client application.
- **`Resource Server`**: Google's APIs act as the resource server. After the user authorizes access, the client application can request resources from these APIs, such as the user's profile information.
- **`User`**: The end-user who wants to log in to the Spring Boot application using their Google account. The user provides their Google credentials and consents to share their information with the client application.


## Screenshots

![Screenshot 2024-06-16 001538](https://github.com/Sarthakverse/oAuth2.0/assets/117356021/5e829493-4932-426b-a240-4a7ccdd494ca)

![Screenshot 2024-06-16 001658](https://github.com/Sarthakverse/oAuth2.0/assets/117356021/eac1364c-2c66-4b1f-8a57-f14f1b92d325)


![Screenshot 2024-06-16 001712](https://github.com/Sarthakverse/oAuth2.0/assets/117356021/bd048fed-f211-4506-b17e-cd930c7cbcb1)

![Screenshot 2024-06-16 001726](https://github.com/Sarthakverse/oAuth2.0/assets/117356021/e92f0098-a831-4efd-b021-6c77644b5ac3)

![Screenshot 2024-06-16 001748](https://github.com/Sarthakverse/oAuth2.0/assets/117356021/22c9d4bc-3ddc-4f5d-8371-d714355c27d9)

![Screenshot 2024-06-16 001808](https://github.com/Sarthakverse/oAuth2.0/assets/117356021/d6600cfb-13f5-4272-9316-fc8430ce1692)

![Screenshot 2024-06-16 001835](https://github.com/Sarthakverse/oAuth2.0/assets/117356021/3009d66b-e450-4fbc-a82d-b5e0104d2249)

![Screenshot 2024-06-16 001843](https://github.com/Sarthakverse/oAuth2.0/assets/117356021/6bdf3624-7d0f-4282-bae3-55a21fd83dcd)

![Screenshot 2024-06-16 001855](https://github.com/Sarthakverse/oAuth2.0/assets/117356021/7b1be260-5a0b-40a8-8c8b-b17982b7afe7)


